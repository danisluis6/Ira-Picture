package tutorial.lorence.improveskillandroid.di.component;

import dagger.Subcomponent;
import tutorial.lorence.improveskillandroid.view.activity.splash.SplashScreen;
import tutorial.lorence.improveskillandroid.di.module.SplashModule;
import tutorial.lorence.improveskillandroid.di.scope.ActivityScope;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

@ActivityScope
@Subcomponent(

        modules = {
                SplashModule.class
        }
)
public interface SplashComponent {

    SplashScreen inject(SplashScreen activity);
}