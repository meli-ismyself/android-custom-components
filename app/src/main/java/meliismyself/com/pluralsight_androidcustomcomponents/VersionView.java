package meliismyself.com.pluralsight_androidcustomcomponents;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Meli Oktavia on 2/17/2016.
 */
public class VersionView extends TextView {
    public VersionView(Context context) {
        super(context);
        SetVersion();
    }

    public VersionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        SetVersion();
    }

    public VersionView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        SetVersion();
    }

    public VersionView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        SetVersion();
    }

    private void SetVersion() {
        try {
            PackageInfo packageInfo = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0);
            setText(packageInfo.versionName);
        }catch (PackageManager.NameNotFoundException e){

        }
        setBackgroundColor(Color.RED);
        //setBackgroundColor(Color.RED);
    }
}
