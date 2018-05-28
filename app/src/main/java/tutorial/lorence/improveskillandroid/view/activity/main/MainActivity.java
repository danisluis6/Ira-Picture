package tutorial.lorence.improveskillandroid.view.activity.main;

import tutorial.lorence.improveskillandroid.R;
import tutorial.lorence.improveskillandroid.app.Application;
import tutorial.lorence.improveskillandroid.di.module.MainModule;
import tutorial.lorence.improveskillandroid.view.activity.SharedMediaActivity;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class MainActivity extends SharedMediaActivity {

    @Override
    public void distributedDaggerComponents() {
        super.distributedDaggerComponents();
        Application.getInstance()
                .getAppComponent()
                .plus(new MainModule(this))
                .inject(this);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

}
