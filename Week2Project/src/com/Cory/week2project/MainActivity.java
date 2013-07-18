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






import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	// defining outside params
	LinearLayout ll;
	LinearLayout.LayoutParams lp;
	
	EditText amountField;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// setting my layout for this view
		// setting up the layout of my program
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(lp);
		
		// creating a new textView
		TextView tv = new TextView(this);
		tv.setText("Please enter in the amount you wish to spend on a guitar.");
		ll.addView(tv);
		
		// creating a box for the user to enter in an amount
		amountField = new EditText(this);
		ll.addView(amountField);
		
		// creating a search for guitar button
		Button enterButton = new Button(this);
		enterButton.setText("Search for guitar");
		ll.addView(enterButton);
		
		
		
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
