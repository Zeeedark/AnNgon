package com.example.mon_ngon_app;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();
        // set tab search
        TabSpec Search = tabHost.newTabSpec("Search");
        // set title va icon cho tabhost
        Search.setIndicator("Search", getResources().getDrawable(R.drawable.seach_button));
        Intent search_Intent = new Intent(this, Search_MainActivity.class);
        Search.setContent(search_Intent);
        // set Tab Noi Bat
        TabSpec Not_bat = tabHost.newTabSpec("Noi Bat");
        //set Title cho tab noibat
        Not_bat.setIndicator("Noi Bat",getResources().getDrawable(R.drawable.seach_button));
        Intent noibat_Intent = new Intent(this,Noi_Bat_MainActivity.class);
        Not_bat.setContent(noibat_Intent);
        // set tab sale 
        TabSpec Sale_Off = tabHost.newTabSpec("Sale Off");
        Sale_Off.setIndicator("Sale Off",getResources().getDrawable(R.drawable.seach_button));
        Intent sale_Intent = new Intent(this,SaleOff_MainActivity.class);
        Sale_Off.setContent(sale_Intent);
        // set cac tab da tao
        tabHost.addTab(Search);
        tabHost.addTab(Not_bat);
        tabHost.addTab(Sale_Off);
        
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
