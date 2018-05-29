package tutorial.lorence.improveskillandroid.establish;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public abstract class ThemedViewHolder extends RecyclerView.ViewHolder implements Themed {

    public ThemedViewHolder(View view) {
        super(view);
    }

    @Override
    public void refreshTheme(ThemeHelper themeHelper) {
        for (View view : ViewUtil.getAllChildren(itemView)) {
            if (view instanceof Themed) ((Themed) view).refreshTheme(themeHelper);
        }
    }
}