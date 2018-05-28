package tutorial.lorence.improveskillandroid.custom;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public interface ITypeface {

    IIcon getIcon(String key);

    HashMap<String, Character> getCharacters();

    /**
     * The Mapping Prefix to identify this font
     * must have a length of 3
     *
     * @return mappingPrefix (length = 3)
     */
    String getMappingPrefix();

    String getFontName();

    String getVersion();

    int getIconCount();

    Collection<String> getIcons();

    String getAuthor();

    String getUrl();

    String getDescription();

    String getLicense();

    String getLicenseUrl();

    Typeface getTypeface(Context ctx);

}
