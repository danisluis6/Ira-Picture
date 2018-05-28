package tutorial.lorence.improveskillandroid.view.activity.splash;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

import tutorial.lorence.improveskillandroid.R;
import tutorial.lorence.improveskillandroid.app.Application;
import tutorial.lorence.improveskillandroid.di.module.SplashModule;
import tutorial.lorence.improveskillandroid.other.ImplicitIntentFilter;
import tutorial.lorence.improveskillandroid.other.PermissionCode;
import tutorial.lorence.improveskillandroid.other.PermissionUtils;
import tutorial.lorence.improveskillandroid.other.ThemeEditorUtils;
import tutorial.lorence.improveskillandroid.other.ToastUtils;
import tutorial.lorence.improveskillandroid.view.activity.SharedMediaActivity;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class SplashScreen extends SharedMediaActivity {

    @Inject
    Context mContext;

    @Inject
    PermissionUtils mPermissionUtils;

    @Inject
    ThemeEditorUtils mThemeEditorUtils;

    @Inject
    ToastUtils mToastUtils;

    @Inject
    PermissionCode mPermissionCode;

    @Inject
    ImplicitIntentFilter mIntentFilter;

    @Inject
    SplashScreen mSplashScreen;

    private final String TAG = SplashScreen.class.getSimpleName();

    @Override
    public void distributedDaggerComponents() {
        super.distributedDaggerComponents();
        Application.getInstance()
                .getAppComponent()
                .plus(new SplashModule(this))
                .inject(this);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initAttributes() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        mThemeEditorUtils.setNavBarDefaultColor(mContext, this);
        mThemeEditorUtils.setStatusBarDefaultColor(mContext, this);

        if (mPermissionUtils.isStoragePermissionsGranted(mContext)) {
            if (getIntent().getAction().equals(mIntentFilter.getOpenAlbum())) {
                Bundle data = getIntent().getExtras();
                if (data != null) {
                    String ab = data.getString("albumPath");
                    if (ab != null) {
                        start();
                    }
                } else {
                    mToastUtils.show(mContext, "Album not found");
                }
            } else {
                start();
            }
        } else
            mPermissionUtils.requestPermissions(this, mPermissionCode.getExternalPermissionCode(), Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE);
    }

    private void start() {
    }

    @Override
    protected void initViews() {

    }
}
