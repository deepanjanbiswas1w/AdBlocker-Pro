package com.adguard.pro;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import java.util.HashSet;

public class MainActivity extends Activity {
    // দ্রুততম ডোমেইন চেকিংয়ের জন্য Hash-Table ব্যবহার
    private HashSet<String> dnsCache = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // AdGuard DNS Active IPs: 94.140.14.14
        dnsCache.add("dns.adguard.com");
        
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#050505"));
        layout.setGravity(Gravity.CENTER);

        TextView tv = new TextView(this);
        tv.setText("ADGUARD PRO\nROCKET ENGINE ACTIVE");
        tv.setTextColor(Color.parseColor("#00FFCC"));
        tv.setTextSize(24);
        tv.setGravity(Gravity.CENTER);

        layout.addView(tv);
        setContentView(layout);
    }
}
