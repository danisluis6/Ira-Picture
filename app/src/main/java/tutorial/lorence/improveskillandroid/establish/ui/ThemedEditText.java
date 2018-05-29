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

public class ThemedEditText extends android.support.v7.widget.AppCompatEditText implements Themed {


    public ThemedEditText(Context context) {
        this(context, null);
    }

    public ThemedEditText(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        //setBackgroundResource(android.R.color.transparent);
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        setTextColor(theme.getTextColor());
        setHintTextColor(theme.getSubTextColor());
        setHighlightColor(theme.getPrimaryColor());
    }
}
