package tutorial.lorence.improveskillandroid.di.component;

import javax.inject.Singleton;

import dagger.Component;
import tutorial.lorence.improveskillandroid.di.module.AppModule;
import tutorial.lorence.improveskillandroid.di.module.MainModule;
import tutorial.lorence.improveskillandroid.di.module.SplashModule;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

@Singleton
@Component(
        modules = {
                AppModule.class
        }
)
public interface AppComponent {
    SplashComponent plus(SplashModule module);
    MainComponent plus(MainModule module);
}