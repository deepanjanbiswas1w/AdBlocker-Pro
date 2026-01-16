package com.adguard.pro;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.BLACK);
        l.setGravity(Gravity.CENTER);

        TextView t = new TextView(this);
        t.setText("ADGUARD ROCKET MAX v50");
        t.setTextColor(Color.GREEN);
        t.setTextSize(25);
        l.addView(t);

        Button b1 = new Button(this);
        b1.setText("DNS 1: ROCKET SPEED");
        b1.setOnClickListener(v -> Toast.makeText(this, "DNS Active", 0).show());
        l.addView(b1);

        setContentView(l);
    }
}
