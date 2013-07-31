/*
 * Project		Week4Project
 * 
 * Package		com.Cory.week4project
 * 
 * @author		Cory Green
 * 
 * date			Jul 30, 2013
 */
package com.Cory.week4project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// takes the XML file created and presents it to the contentView
		setContentView(R.layout.main_layout);
		
		Spinner spinner = (Spinner) findViewById(R.id.dropDown);
		
		// create an array adapter
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.dropDownMenuArray, android.R.layout.simple_spinner_item);
		
		// specify the layout to use
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spinner.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
