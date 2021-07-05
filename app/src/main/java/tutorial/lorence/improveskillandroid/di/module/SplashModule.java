package tutorial.lorence.improveskillandroid.di.module;

import dagger.Module;
import dagger.Provides;
import tutorial.lorence.improveskillandroid.di.scope.ActivityScope;
import tutorial.lorence.improveskillandroid.other.ThemeEditorUtils;
import tutorial.lorence.improveskillandroid.view.activity.splash.SplashScreen;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

@Module
public class SplashModule {

    private SplashScreen splashScreen;

    public SplashModule(SplashScreen splashScreen) {
        this.splashScreen = splashScreen;
    }

    @Provides
    @ActivityScope
    SplashScreen provideSplashActivity() {
        return splashScreen;
    }

    @Provides
    @ActivityScope
    ThemeEditorUtils provideThemeEditorUtils() {
        return new ThemeEditorUtils();
    }

}
