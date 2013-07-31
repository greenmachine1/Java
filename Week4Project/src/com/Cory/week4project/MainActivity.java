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

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// takes the XML file created and presents it to the contentView
		setContentView(R.layout.main_layout);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
