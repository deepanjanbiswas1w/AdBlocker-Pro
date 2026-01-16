package com.adguard.pro;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import java.util.HashSet;

public class MainActivity extends Activity {
    // এখানে Hash Table ব্যবহার করা হয়েছে দ্রুত চেক করার জন্য
    private HashSet<String> cache = new HashSet<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // AdGuard DNS Servers: 94.140.14.14, 94.140.15.15
        cache.add("dns.adguard.com");
        
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#050505"));
        layout.setGravity(Gravity.CENTER);

        TextView tv = new TextView(this);
        tv.setText("ADGUARD ROCKET ENGINE\n[DNS ACTIVE]");
        tv.setTextColor(Color.parseColor("#00FFCC"));
        tv.setTextSize(26);
        tv.setGravity(Gravity.CENTER);

        layout.addView(tv);
        setContentView(layout);
    }
}
