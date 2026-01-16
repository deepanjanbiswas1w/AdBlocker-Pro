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
        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setBackgroundColor(Color.parseColor("#080808"));
        main.setGravity(Gravity.CENTER);

        TextView head = new TextView(this);
        head.setText("ADGUARD ROCKET v51\nTITAN EDITION");
        head.setTextColor(Color.parseColor("#00FFCC"));
        head.setTextSize(28);
        head.setGravity(Gravity.CENTER);
        head.setPadding(0, 0, 0, 100);
        main.addView(head);

        // DNS Button
        Button dns = new Button(this);
        dns.setText("DNS 1: ROCKET SPEED");
        dns.setOnClickListener(v -> Toast.makeText(this, "AdGuard DNS: Connected", 0).show());
        main.addView(dns);

        // VPN Button
        Button vpn = new Button(this);
        vpn.setText("VPN: NORMAL SPEED");
        vpn.setOnClickListener(v -> Toast.makeText(this, "Local VPN: Active", 0).show());
        main.addView(vpn);

        setContentView(main);
    }
}
