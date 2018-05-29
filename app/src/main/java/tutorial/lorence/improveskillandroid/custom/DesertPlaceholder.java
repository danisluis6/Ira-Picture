package tutorial.lorence.improveskillandroid.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by vuongluis on 4/14/2018.
 * @author vuongluis
 * @version 0.0.1
 */

public class DesertPlaceholder extends FrameLayout {
    public static boolean animationEnabled = true;
    private TextView button;
    private TextView message;

    public DesertPlaceholder(Context context) {
        super(context);
        this.init(context, (AttributeSet)null);
    }

    public DesertPlaceholder(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init(context, attrs);
    }

    public DesertPlaceholder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(layout.place_holder, this, true);
        this.message = (TextView)this.findViewById(id.placeholder_message);
        this.button = (TextView)this.findViewById(id.placeholder_button);
        TypedArray attributes = context.obtainStyledAttributes(attrs, styleable.DesertPlaceholder);

        try {
            String messageText = attributes.getString(styleable.DesertPlaceholder_dp_message);
            String buttonText = attributes.getString(styleable.DesertPlaceholder_dp_buttonText);
            this.message.setText(messageText);
            if(TextUtils.isEmpty(buttonText)) {
                this.button.setVisibility(8);
            } else {
                this.button.setText(buttonText);
            }
        } finally {
            attributes.recycle();
        }

        this.setBackgroundColor(this.getResources().getColor(color.background_desert));
    }

    public void setOnButtonClickListener(OnClickListener clickListener) {
        this.button.setOnClickListener(clickListener);
    }

    public void setMessage(String msg) {
        this.message.setText(msg);
    }

    public void setButtonText(String action) {
        this.button.setText(action);
    }
}
