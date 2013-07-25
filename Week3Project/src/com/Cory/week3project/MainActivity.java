package com.Cory.week3project;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	Context _context;
	LinearLayout _appLayout;
	
	SearchForm _searchForm;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		_appLayout = new LinearLayout(this);
		
		_context = this;
		
		_searchForm = new SearchForm(_context, "Enter the name of a band", "Go");
		
		_appLayout.addView(_searchForm);
		
		
		
		
		
		setContentView(_appLayout);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
