package com.adguard.pro;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.graphics.Color;
import android.view.Gravity;
import java.util.HashSet;

public class MainActivity extends Activity {
    private HashSet<String> localCache = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#0A0A0A"));
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(50, 50, 50, 50);

        TextView title = new TextView(this);
        title.setText("ADGUARD ROCKET v46");
        title.setTextColor(Color.parseColor("#00FFCC"));
        title.setTextSize(28);
        title.setPadding(0, 0, 0, 100);
        layout.addView(title);

        // অপশন ১: DNS 1 (Rocket Speed)
        Button btnDns = new Button(this);
        btnDns.setText("DNS 1: ROCKET SPEED (ADGUARD)");
        btnDns.setBackgroundColor(Color.parseColor("#1A1A1A"));
        btnDns.setTextColor(Color.white);
        btnDns.setOnClickListener(v -> Toast.makeText(this, "AdGuard DNS Rocket Active!", Toast.LENGTH_SHORT).show());
        layout.addView(btnDns);

        // গ্যাপ
        View space = new View(this);
        layout.addView(space, new LinearLayout.LayoutParams(1, 50));

        // অপশন ২: Local (Normal Speed)
        Button btnLocal = new Button(this);
        btnLocal.setText("LOCAL: NORMAL SPEED");
        btnLocal.setBackgroundColor(Color.parseColor("#1A1A1A"));
        btnLocal.setTextColor(Color.white);
        btnLocal.setOnClickListener(v -> Toast.makeText(this, "Local Filtering Active!", Toast.LENGTH_SHORT).show());
        layout.addView(btnLocal);

        setContentView(layout);
    }
}
