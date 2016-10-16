package develop.beta1139.testlayout;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.view);
        WindowManager windowManager = getWindowManager();
        Display display = windowManager.getDefaultDisplay();

        Log.e("dbg", "w: " + display.getWidth() + ", h: " + display.getHeight());

        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = display.getWidth() * 9 / 16;
        view.setLayoutParams(params);
    }
}
