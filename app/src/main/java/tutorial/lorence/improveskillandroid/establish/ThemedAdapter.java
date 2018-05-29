package tutorial.lorence.improveskillandroid.establish;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public abstract class ThemedAdapter<VH extends ThemedViewHolder>  extends RecyclerView.Adapter<VH> implements Themed {

    private ThemeHelper themeHelper;

    public ThemedAdapter(Context context) {
        themeHelper = ThemeHelper.getInstanceLoaded(context);
    }

    public ThemeHelper getThemeHelper() {
        return themeHelper;
    }

    public void setThemeHelper(ThemeHelper themeHelper) {
        this.themeHelper = themeHelper;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.refreshTheme(getThemeHelper());
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        setThemeHelper(theme);
        notifyDataSetChanged();
    }
}
