package tutorial.lorence.improveskillandroid.other;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class LogUtils {

    @Inject
    public LogUtils() {
    }

    public void show(String Tag, String message) {
        Log.i(Tag, message);
    }

}
