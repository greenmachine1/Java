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

import com.Cory.lib.WebInfo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

	// global variables
	Context _context;
	
	String userDropDownSelection;
	String InputString;
	
	Boolean _connected = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		_context = this;	
		
		// takes the XML file created and presents it to the contentView
		setContentView(R.layout.main_layout);
		
		// Detect network connection
		_connected = WebInfo.getConnectionStatus(_context);
		if(_connected)
		{
			//Log.i("Network Connection", WebInfo.getConnectionType(_context));
		}
		
		
		
		// setting the spinner
		Spinner spinner = (Spinner) findViewById(R.id.dropDown);
		
		// when a selection has been made in the spinner drop down, do this...
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {
				// TODO Auto-generated method stub
				
				Log.i("Clicked", (parent.getItemAtPosition(pos).toString()));
				
				// putting the user selection into a string
				userDropDownSelection = (parent.getItemAtPosition(pos).toString());
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				userDropDownSelection = "Artist";
			}
		});
		
		
		
		// create an array adapter
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.dropDownMenuArray, android.R.layout.simple_spinner_item);
		
		// specify the layout to use
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spinner.setAdapter(adapter);

		// getting the go button to do something
		Button goButton = (Button) findViewById(R.id.goButton);
		
		goButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				@SuppressWarnings("unused")
				String tempString = "";
				if(userDropDownSelection != null){
					tempString = userDropDownSelection;
				}
				
				//Log.i("Clicked Go", tempString);
				
				// gathering the user input
				EditText editTextBox = (EditText) findViewById(R.id.searchField);
				String InputString = editTextBox.getText().toString();
				
				
			}
		});

	}

	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
