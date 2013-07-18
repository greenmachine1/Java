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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {

	
	EditText amountField;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// setting my layout for this view
		LinearLayout ll = new LinearLayout(this);
		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		ll.setLayoutParams(lp);
		
		// creating a new textView
		TextView tv = new TextView(this);
		tv.setText("Please enter in the amount you wish to spend");
		ll.addView(tv);
		
		// creating a box for the user to enter in an amount
		amountField = new EditText(this);
		ll.addView(amountField);
		
		//String temporaryString = Json.readJSON("Jackson");

		
		//float tempPriceFloat = Float.valueOf(Json.getPrice("Jackson")).floatValue();
		
		
		//tv.setText(temporaryString + tempPriceFloat);

		
		
		setContentView(ll);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
