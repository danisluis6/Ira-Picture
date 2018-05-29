package tutorial.lorence.improveskillandroid.establish;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class ThemedAlertDialogBuilder extends AlertDialog.Builder {

    private ThemeHelper themeHelper;

    public ThemedAlertDialogBuilder(Context context, ThemeHelper themeHelper) {
        super(context, themeHelper.getDialogStyle());
        this.themeHelper = themeHelper;
    }

    @Override
    public AlertDialog.Builder setView(View view) {
        for (View v : ViewUtil.getAllChildren(view))
            if (v instanceof Themed) ((Themed) v).refreshTheme(themeHelper);
        return super.setView(view);
    }
}
