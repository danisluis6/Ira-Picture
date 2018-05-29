package tutorial.lorence.improveskillandroid.establish.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;

import tutorial.lorence.improveskillandroid.establish.ThemeHelper;
import tutorial.lorence.improveskillandroid.establish.Themed;
import tutorial.lorence.improveskillandroid.establish.icon.IIcon;
import tutorial.lorence.improveskillandroid.establish.icon.IconicsDrawable;


/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class ThemedFab extends FloatingActionButton implements Themed {

    private IconicsDrawable mIcon = null;

    public ThemedFab(Context context) {
        this(context, null);
    }

    public ThemedFab(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedFab(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.ThemedFab);
        setIcon(a.getString(R.styleable.ThemedFab_liz_icon));
        a.recycle();
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        setBackgroundTintList(ColorStateList.valueOf(theme.getAccentColor()));
        setImageDrawable(mIcon);
    }

    public void setIcon(IIcon icon) {
        mIcon = new IconicsDrawable(getContext()).icon(icon).color(Color.WHITE);
    }

    public void setIcon(String icon) {
        mIcon = new IconicsDrawable(getContext()).icon(icon).color(Color.WHITE);

    }
}
