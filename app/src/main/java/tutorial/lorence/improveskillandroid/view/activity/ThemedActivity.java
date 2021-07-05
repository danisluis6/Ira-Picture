package tutorial.lorence.improveskillandroid.view.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public abstract class ThemedActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        distributedDaggerComponents();
        setContentView(getLayoutRes());
        ButterKnife.bind(this);
        ButterKnife.bind(this);
        initAttributes();
        initViews();
    }

    public void distributedDaggerComponents() {

    }

    protected int getLayoutRes() {
        return -1;
    }

    protected void initAttributes(){}

    protected void initViews(){}

    @Override
    protected void onDestroy() {
        ButterKnife.bind(this).unbind();
        super.onDestroy();
    }
}
