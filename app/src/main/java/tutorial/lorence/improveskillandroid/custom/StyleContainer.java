package tutorial.lorence.improveskillandroid.custom;

import android.text.ParcelableSpan;
import android.text.Spannable;
import android.text.style.CharacterStyle;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class StyleContainer {
    public int startIndex;
    public int endIndex;
    public String icon;
    public ITypeface font;
    public ParcelableSpan span;
    public CharacterStyle style;
    public int flags = Spannable.SPAN_EXCLUSIVE_EXCLUSIVE;

    public StyleContainer(int startIndex, int endIndex, String icon, ITypeface font, int flags) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.icon = icon;
        this.font = font;
        this.flags = flags;
    }

    public StyleContainer(int startIndex, int endIndex, String icon, ITypeface font) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.icon = icon;
        this.font = font;
    }

    public StyleContainer(int startIndex, int endIndex, ParcelableSpan span) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.span = span;
    }

    public StyleContainer(int startIndex, int endIndex, ParcelableSpan span, int flags) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.span = span;
        this.flags = flags;
    }

    public StyleContainer(int startIndex, int endIndex, CharacterStyle style) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.style = style;
    }

    public StyleContainer(int startIndex, int endIndex, CharacterStyle style, int flags) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.style = style;
        this.flags = flags;
    }
}
