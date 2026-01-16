package com.adguard.pro;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#050505"));
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(60, 60, 60, 60);

        TextView title = new TextView(this);
        title.setText("ROCKET ENGINE v47");
        title.setTextColor(Color.parseColor("#00FFCC"));
        title.setTextSize(30);
        title.setPadding(0, 0, 0, 80);
        layout.addView(title);

        // DNS 1 - রকেট স্পিড বাটন
        Button dnsBtn = new Button(this);
        dnsBtn.setText("DNS 1: ROCKET SPEED");
        dnsBtn.setBackgroundColor(Color.parseColor("#121212"));
        dnsBtn.setTextColor(Color.CYAN);
        dnsBtn.setOnClickListener(v -> Toast.makeText(this, "AdGuard DNS: Online", Toast.LENGTH_SHORT).show());
        layout.addView(dnsBtn);

        // স্পেস
        View s = new View(this);
        layout.addView(s, new LinearLayout.LayoutParams(1, 40));

        // LOCAL - নরমাল স্পিড বাটন
        Button localBtn = new Button(this);
        localBtn.setText("VPN: NORMAL SPEED");
        localBtn.setBackgroundColor(Color.parseColor("#121212"));
        localBtn.setTextColor(Color.WHITE);
        localBtn.setOnClickListener(v -> Toast.makeText(this, "Local Filter: Active", Toast.LENGTH_SHORT).show());
        layout.addView(localBtn);

        setContentView(layout);
    }
}
