package tutorial.lorence.improveskillandroid.custom;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public enum Theme {
    LIGHT(1), DARK(2), AMOLED(3);

    public int value;

    Theme(int value) {
        this.value = value;
    }

    public int getValue() { return value;}

    public static Theme fromValue(int value) {
        switch (value) {
            case 1: default: return LIGHT;
            case 2: return DARK;
            case 3: return AMOLED;
        }
    }
}
