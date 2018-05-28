package tutorial.lorence.improveskillandroid.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;

import tutorial.lorence.improveskillandroid.R;
import tutorial.lorence.improveskillandroid.helper.ThemeHelper;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class ThemedToolbar extends Toolbar implements Themed {

    // Custom Theme by JavaCode
    public ThemedToolbar(Context context) {
        super(context, null, R.style.ToolbarTheme);
    }

    public ThemedToolbar(Context context, @Nullable AttributeSet attrs) {
        super(context);
    }

    public ThemedToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context);
    }

    @Override
    public void refreshTheme(ThemeHelper themeHelper) {
        setBackgroundColor(themeHelper.getPrimaryColor());
    }

}
