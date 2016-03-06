package meliismyself.com.pluralsight_androidcustomcomponents;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void setVersionApp(){
        // Show Version in Hello World
        TextView textView = (TextView)findViewById(R.id.tvText);
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            textView.setText(packageInfo.versionName);
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }

    }

    public void CallCustomComponents(){
        VersionView view = new VersionView(this);
        setContentView(view);
    }
}


