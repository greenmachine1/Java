package com.Cory.week3project;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	Context _context;
	LinearLayout _appLayout;
	
	SearchForm _searchForm;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// setting up my LinearLayout
		_appLayout = new LinearLayout(this);
		
		// setting context to = this
		_context = this;
		
		// calling on my SearchForm class
		_searchForm = new SearchForm(_context, "Enter the name of a band", "Go");
		
		// adding _searchForm to my view
		_appLayout.addView(_searchForm);
		
		// creating a button that gets the button within _searchForm
		Button searchButton = _searchForm.getButton();
		
		// creating my onClickListener for my searchButton
		searchButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Log.i("Button Pressed", "yes");
				
			}
			
		});
		
		
		setContentView(_appLayout);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
