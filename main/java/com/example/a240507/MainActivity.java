package com.example.a240507;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabspec1  = tabHost.newTabSpec("dog").setIndicator("강아지");
        tabspec1.setContent(R.id.tab1);
        tabHost.addTab(tabspec1);

        TabHost.TabSpec tabspec2 = tabHost.newTabSpec("cat").setIndicator("고양이");
        tabspec1.setContent(R.id.tab2);
        tabHost.addTab(tabspec2);

        TabHost.TabSpec tabspec3 = tabHost.newTabSpec("rabbit").setIndicator("토끼");
        tabspec1.setContent(R.id.tab3);
        tabHost.addTab(tabspec3);

        TabHost.TabSpec tabspec4 = tabHost.newTabSpec("horse").setIndicator("말");
        tabspec1.setContent(R.id.tab4);
        tabHost.addTab(tabspec4);

        tabHost.setCurrentTab(0);
        

    }
}