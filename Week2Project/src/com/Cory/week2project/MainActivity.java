/*
 * Project		Week2Project
 * 
 * Package		com.Cory.week2project
 * 
 * @author		Cory Green
 * 
 * date			Jul 16, 2013
 */
package com.Cory.week2project;

import java.lang.reflect.Array;

import org.json.JSONObject;

import json.Json;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout ll = new LinearLayout(this);
		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		ll.setLayoutParams(lp);
		
		TextView tv = new TextView(this);
		
		String temporaryString = Json.readJSON("Jackson");
		
		String tempPrice = Json.getPrice("Jackson");
		
		float tempPriceInteger = Float.valueOf(Json.getPrice("Jackson")).floatValue();
		
		
		tv.setText(temporaryString + tempPrice + tempPriceInteger);
		
		ll.addView(tv);
		
		
		setContentView(ll);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
