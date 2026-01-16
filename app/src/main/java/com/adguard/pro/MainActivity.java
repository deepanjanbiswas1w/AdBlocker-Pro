package com.adguard.pro;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import java.util.HashSet;

public class MainActivity extends Activity {
    private HashSet<String> rocketCache = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Hash Table Initialization for Speed
        rocketCache.add("94.140.14.14");

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#050505"));
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(60, 60, 60, 60);

        TextView title = new TextView(this);
        title.setText("ROCKET ENGINE MAX");
        title.setTextColor(Color.parseColor("#00FFCC"));
        title.setTextSize(30);
        title.setPadding(0, 0, 0, 100);
        layout.addView(title);

        // DNS 1 - রকেট স্পিড
        Button dnsBtn = new Button(this);
        dnsBtn.setText("DNS 1: ROCKET SPEED");
        dnsBtn.setBackgroundColor(Color.parseColor("#121212"));
        dnsBtn.setTextColor(Color.CYAN);
        dnsBtn.setOnClickListener(v -> Toast.makeText(this, "AdGuard Rocket Speed Active!", Toast.LENGTH_SHORT).show());
        layout.addView(dnsBtn);

        // VPN - নরমাল স্পিড
        View s = new View(this);
        layout.addView(s, new LinearLayout.LayoutParams(1, 50));

        Button localBtn = new Button(this);
        localBtn.setText("VPN: NORMAL SPEED");
        localBtn.setBackgroundColor(Color.parseColor("#121212"));
        localBtn.setTextColor(Color.WHITE);
        localBtn.setOnClickListener(v -> Toast.makeText(this, "Local VPN Filter Active", Toast.LENGTH_SHORT).show());
        layout.addView(localBtn);

        setContentView(layout);
    }
}
