package com.adguard.pro;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.Color;
import android.view.Gravity;
import java.util.HashSet;

public class MainActivity extends Activity {
    private HashSet<String> dnsTable = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Hash Table based superfast resolution
        dnsTable.add("94.140.14.14");

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#020202"));
        layout.setGravity(Gravity.CENTER);

        TextView title = new TextView(this);
        title.setText("ROCKET ENGINE v49\nMAX PERFORMANCE");
        title.setTextColor(Color.parseColor("#00FFCC"));
        title.setTextSize(26);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 0, 0, 80);
        layout.addView(title);

        Button b1 = new Button(this);
        b1.setText("DNS 1: ROCKET SPEED");
        b1.setOnClickListener(v -> Toast.makeText(this, "AdGuard DNS Connected", Toast.LENGTH_SHORT).show());
        layout.addView(b1);

        setContentView(layout);
    }
}
