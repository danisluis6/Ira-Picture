package tutorial.lorence.improveskillandroid.di.component;

import dagger.Subcomponent;
import tutorial.lorence.improveskillandroid.di.module.MainModule;
import tutorial.lorence.improveskillandroid.di.scope.ActivityScope;
import tutorial.lorence.improveskillandroid.view.activity.main.MainActivity;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

@ActivityScope
@Subcomponent(

        modules = {
                MainModule.class
        }
)
public interface MainComponent {
    MainActivity inject(MainActivity activity);
}
