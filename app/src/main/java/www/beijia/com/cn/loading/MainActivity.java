package www.beijia.com.cn.loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    CustomClipLoading mCustomClipLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomClipLoading = (CustomClipLoading) findViewById(R.id.progressBar);
        mCustomClipLoading.a();
        String urlLocal = "file:///" + "thlm" + File.separator + "thlm";
        Toast.makeText(this, urlLocal, Toast.LENGTH_SHORT).show();

    }

    public void start(View v) {
        mCustomClipLoading.a();
    }

    public void stop(View v) {
        mCustomClipLoading.b();
    }
}
