package tutorial.lorence.improveskillandroid.other;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;

import javax.inject.Inject;

import tutorial.lorence.improveskillandroid.R;
import tutorial.lorence.improveskillandroid.helper.ColorPalette;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class ThemeEditorUtils {

    @Inject
    public ThemeEditorUtils() {
    }

    public void setNavBarDefaultColor(Context context, Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().setStatusBarColor(ColorPalette.getTransparentColor(
                    ContextCompat.getColor(context, R.color.md_black_1000), 70));
        }
    }

    public void setStatusBarDefaultColor(Context context, Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().setNavigationBarColor(ColorPalette.getTransparentColor(
                    ContextCompat.getColor(context, R.color.md_black_1000), 70));
        }
    }
}
