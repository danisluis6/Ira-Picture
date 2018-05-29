package tutorial.lorence.improveskillandroid.establish.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import tutorial.lorence.improveskillandroid.establish.ThemeHelper;
import tutorial.lorence.improveskillandroid.establish.Themed;


/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class ThemedTextView extends AppCompatTextView implements Themed {

    public static final int ACCENT_COLOR = 1;
    public static final int PRIMARY_COLOR = 2;
    public static final int TEXT_COLOR = 3;
    public static final int SUB_TEXT_COLOR = 4;

    int color;

    public ThemedTextView(Context context) {
        this(context, null);
    }

    public ThemedTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.ThemedTextView,
                0, 0);
        color = a.getInt(R.styleable.ThemedTextView_liz_color_style, 3);
        a.recycle();
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        switch (color) {
            case 1:
                setTextColor(theme.getAccentColor());
                break;
            case 2:
                setTextColor(theme.getPrimaryColor());
                break;
            case 3:
            default:
                setTextColor(theme.getTextColor());
                break;
            case 4:
                setTextColor(theme.getSubTextColor());
                break;
        }
    }


    public void setStyleColor(int color) {
        this.color = color;
    }
}
