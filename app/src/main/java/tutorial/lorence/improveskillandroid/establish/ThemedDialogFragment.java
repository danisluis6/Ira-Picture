package tutorial.lorence.improveskillandroid.establish;

import android.content.Context;
import android.support.v4.app.DialogFragment;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class ThemedDialogFragment extends DialogFragment {
    ThemeHelper themeHelper;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        /*if (context instanceof ThemedActivity)
            themeHelper = ((ThemedActivity) context).getThemeHelper();*/
        themeHelper = ThemeHelper.getInstance(getContext());
    }

    public ThemeHelper getThemeHelper() {
        return themeHelper;
    }

    public int getPrimaryColor() {
        return themeHelper.getPrimaryColor();
    }

    public int getDialogStyle() {
        return themeHelper.getDialogStyle();
    }

    public int getAccentColor() {
        return themeHelper.getAccentColor();
    }

    public Theme getBaseTheme() {
        return themeHelper.getBaseTheme();
    }

    public int getBackgroundColor() {
        return themeHelper.getBackgroundColor();
    }

    public int getCardBackgroundColor() {
        return themeHelper.getCardBackgroundColor();
    }

    public int getIconColor() {
        return themeHelper.getIconColor();
    }

    public int getTextColor() {
        return themeHelper.getTextColor();
    }

    @Override
    public int getTheme() {
        return getDialogStyle();
    }
}
