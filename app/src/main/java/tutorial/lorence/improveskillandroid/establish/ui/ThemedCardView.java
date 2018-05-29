package tutorial.lorence.improveskillandroid.establish.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

import tutorial.lorence.improveskillandroid.establish.ThemeHelper;
import tutorial.lorence.improveskillandroid.establish.Themed;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class ThemedCardView extends CardView implements Themed {

    public ThemedCardView(Context context) {
        this(context, null);
    }

    public ThemedCardView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedCardView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        setCardBackgroundColor(theme.getCardBackgroundColor());
    }
}
