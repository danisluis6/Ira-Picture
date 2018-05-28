package tutorial.lorence.improveskillandroid.other;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class ToastUtils {

    @Inject
    public ToastUtils() {
    }

    public void show(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
