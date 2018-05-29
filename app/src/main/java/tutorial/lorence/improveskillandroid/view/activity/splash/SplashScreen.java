package tutorial.lorence.improveskillandroid.view.activity.splash;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import javax.inject.Inject;

import tutorial.lorence.improveskillandroid.R;
import tutorial.lorence.improveskillandroid.app.Application;
import tutorial.lorence.improveskillandroid.di.module.SplashModule;
import tutorial.lorence.improveskillandroid.helper.Constant;
import tutorial.lorence.improveskillandroid.other.ImplicitIntentFilter;
import tutorial.lorence.improveskillandroid.other.LogUtils;
import tutorial.lorence.improveskillandroid.other.PermissionUtils;
import tutorial.lorence.improveskillandroid.other.ThemeEditorUtils;
import tutorial.lorence.improveskillandroid.other.ToastUtils;
import tutorial.lorence.improveskillandroid.view.activity.SharedMediaActivity;
import tutorial.lorence.improveskillandroid.view.activity.main.MainActivity;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class SplashScreen extends SharedMediaActivity implements SplashView {

    @Inject
    Context mContext;

    @Inject
    PermissionUtils mPermissionUtils;

    @Inject
    ThemeEditorUtils mThemeEditorUtils;

    @Inject
    ToastUtils mToastUtils;

    @Inject
    LogUtils mLogUtils;

    @Inject
    ImplicitIntentFilter mIntentFilter;

    @Inject
    SplashScreen mSplashScreen;

    private final String TAG = SplashScreen.class.getSimpleName();
    private boolean pickMode = false;

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
        pickMode = TextUtils.equals(getIntent().getAction(), Intent.ACTION_GET_CONTENT) || TextUtils.equals(getIntent().getAction(), Intent.ACTION_PICK);
        mLogUtils.show(TAG, String.valueOf(pickMode));
        if (mPermissionUtils.isStoragePermissionsGranted(mContext)) {
            if (TextUtils.equals(getIntent().getAction(), mIntentFilter.getOpenAlbum())) {
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
            mPermissionUtils.requestPermissions(this, Constant.EXTERNAL_STORAGE_PERMISSIONS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE);
    }

    @Override
    public void start() {
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);

        if (pickMode) {
            intent.putExtra(Constant.ARGS_PICK_MODE, pickMode);
            startActivityForResult(intent, Constant.PICK_MEDIA_REQUEST);
        } else {
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case Constant.PICK_MEDIA_REQUEST:
                if (resultCode == RESULT_OK) {
                    setResult(RESULT_OK, data);
                    finish();
                }
                break;
            default: super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
