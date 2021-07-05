package tutorial.lorence.improveskillandroid.di.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import tutorial.lorence.improveskillandroid.app.Application;
import tutorial.lorence.improveskillandroid.other.ImplicitIntentFilter;
import tutorial.lorence.improveskillandroid.other.LogUtils;
import tutorial.lorence.improveskillandroid.other.PermissionCode;
import tutorial.lorence.improveskillandroid.other.PermissionUtils;
import tutorial.lorence.improveskillandroid.other.ToastUtils;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

@Module
public class AppModule {

    private Application mApplication;
    private Context mContext;

    public AppModule(Application application, Context context) {
        this.mApplication = application;
        this.mContext = context;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return mContext;
    }

    @Provides
    @Singleton
    PermissionUtils providePermissionUtils() {
        return new PermissionUtils();
    }

    @Provides
    @Singleton
    ToastUtils provideToastUtils() {
        return new ToastUtils();
    }

    @Provides
    @Singleton
    LogUtils provideLogUtils() {
        return new LogUtils();
    }

    @Provides
    @Singleton
    PermissionCode providePermissionCode() { return new PermissionCode(); }

    @Provides
    @Singleton
    ImplicitIntentFilter provideImplicitIntentFilter() {
        return new ImplicitIntentFilter();
    }
}
