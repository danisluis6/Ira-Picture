package tutorial.lorence.improveskillandroid.establish.icon;

import android.text.SpannableStringBuilder;

import java.util.LinkedList;


/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class TextStyleContainer {
    public SpannableStringBuilder spannableStringBuilder;
    public LinkedList<StyleContainer> styleContainers;

    public TextStyleContainer(SpannableStringBuilder spannableStringBuilder, LinkedList<StyleContainer> styleContainers) {
        this.spannableStringBuilder = spannableStringBuilder;
        this.styleContainers = styleContainers;
    }
}
