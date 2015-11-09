package com.example.mon_ngon_app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SaleOff_MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sale_off__main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sale_off__main, menu);
		return true;
	}

}
