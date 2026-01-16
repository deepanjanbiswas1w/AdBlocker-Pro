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

        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setBackgroundColor(Color.parseColor("#080808"));
        main.setGravity(Gravity.CENTER);

        TextView head = new TextView(this);
        head.setText("ADGUARD ROCKET v51\nTITAN EDITION");
        head.setTextColor(Color.parseColor("#00FFCC"));
        head.setTextSize(26);
        head.setGravity(Gravity.CENTER);
        head.setPadding(0,0,0,80);
        main.addView(head);

        Button dns = new Button(this);
        dns.setText("DNS 1: ROCKET SPEED");
        dns.setOnClickListener(v ->
            Toast.makeText(this,"AdGuard DNS: Connected",Toast.LENGTH_SHORT).show()
        );
        main.addView(dns);

        Button vpn = new Button(this);
        vpn.setText("VPN: NORMAL SPEED");
        vpn.setOnClickListener(v ->
            Toast.makeText(this,"Local VPN: Active",Toast.LENGTH_SHORT).show()
        );
        main.addView(vpn);

        setContentView(main);
    }
}
