package com.adguard.pro;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("AdGuard Rocket v51\nTitan Stable");
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(24);

        setContentView(tv);
    }
}
