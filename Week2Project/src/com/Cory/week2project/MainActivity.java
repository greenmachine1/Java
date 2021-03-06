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






import json.Json;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	// defining outside params
	LinearLayout ll;
	LinearLayout.LayoutParams lp;
	
	EditText amountField;
	Button enterButton;
	TextView availableGuitarText;
	
	float amountEntered;
	String nameOfGuitarSelected;
	String temporaryGuitarNames;
	String[] guitarNames = {"Jackson", "Fender", "Gibson", "Ibanez"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
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
		enterButton = new Button(this);
		enterButton.setText("Search for guitar");
		ll.addView(enterButton);
		
		// my on click listener for my enterButton
		enterButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// casting the amountEntered into a float value
				amountEntered = Float.valueOf(amountField.getText().toString()).floatValue();
		
				// using a for loop to cycle through all my guitar names
				for(int i = 0; i < guitarNames.length; i++)
				{
					float tempPriceFloat = Float.valueOf(Json.getPrice(guitarNames[i])).floatValue();
					
					if(amountEntered >= tempPriceFloat)
					{
						temporaryGuitarNames = Json.readJSON(guitarNames[i]);
						//Log.i("Ok", "" + temporaryGuitarNames);
					}
				}
				
				availableGuitarText = (TextView) v;
				availableGuitarText.setText(temporaryGuitarNames);
			}
		});
		
		
		availableGuitarText = new TextView(this);
		ll.addView(availableGuitarText);

		
		setContentView(ll);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
