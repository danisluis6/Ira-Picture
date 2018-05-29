package tutorial.lorence.improveskillandroid.establish.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import tutorial.lorence.improveskillandroid.establish.ThemeHelper;
import tutorial.lorence.improveskillandroid.establish.Themed;


/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class ThemedIcon extends IconicsImageView implements Themed {
    public ThemedIcon(Context context) {
        this(context, null);
    }

    public ThemedIcon(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedIcon(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        setColor(theme.getIconColor());
    }

    public void setColor(int color) {
        setIcon(getIcon().color(color));
    }

    public void setIcon(IIcon icon) {
        setIcon(getIcon().icon(icon));
    }
}
