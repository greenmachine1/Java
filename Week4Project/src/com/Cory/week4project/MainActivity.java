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
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// takes the XML file created and presents it to the contentView
		setContentView(R.layout.main_layout);
		
		// setting the spinner
		Spinner spinner = (Spinner) findViewById(R.id.dropDown);
		//spinner.setOnItemSelectedListener(this);
		
		// create an array adapter
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.dropDownMenuArray, android.R.layout.simple_spinner_item);
		
		// specify the layout to use
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spinner.setAdapter(adapter);
		

	}
	
	public class SpinnerActivity extends Activity implements OnItemSelectedListener {
	    
	    public void onItemSelected(AdapterView<?> parent, View view, 
	            int pos, long id) {
	        // An item was selected. You can retrieve the selected item using
	        // parent.getItemAtPosition(pos)
	    	String resultFromSpinner = (parent.getItemAtPosition(pos).toString());
	    	Log.i("Yes", resultFromSpinner);
	    }

	    public void onNothingSelected(AdapterView<?> parent) {
	        // Another interface callback
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
