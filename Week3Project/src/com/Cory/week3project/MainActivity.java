/*
 * Project		Week3Project
 * 
 * Package		com.Cory.week3project
 * 
 * @author		Cory Green
 * 
 * date			Jul 25, 2013
 */
package com.Cory.week3project;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

//import org.json.JSONException;
//import org.json.JSONObject;



import com.Cory.lib.WebInfo;


import android.os.AsyncTask;
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
	Boolean _connected = false;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	
		
		// setting up my LinearLayout
		_appLayout = new LinearLayout(this);
		
		// setting context to = this
		_context = this;
		
		// calling on my SearchForm class
		_searchForm = new SearchForm(_context, "Enter the name of a band", "Go");
		
		
		// creating a button that gets the button within _searchForm
		Button searchButton = _searchForm.getButton();
		
		// creating my onClickListener for my searchButton
		searchButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Log.i("Button Pressed", "yes");
				Log.i("Click handler",_searchForm.getField().getText().toString());
				
				// calls on the getInfoFromApple function and puts in the text
				// from the searchForm
				getInfoFromApple(_searchForm.getField().getText().toString());
			}
			
		});
		
		// Detect network connection
		_connected = WebInfo.getConnectionStatus(_context);
		if(_connected)
		{
			Log.i("Network Connection", WebInfo.getConnectionType(_context));
		}
				
		
		
		
		// adding _searchForm to my view
		_appLayout.addView(_searchForm);
		
		// making it so the grid is beneath every thing
		_appLayout.setOrientation(LinearLayout.VERTICAL);
		
		setContentView(_appLayout);
		
	}
	
	public void getInfoFromApple(String enteredSearchText){
		Log.i("Clicked", enteredSearchText);
		
		String baseURL = "https://itunes.apple.com/search?term=";
		String withEnteredSearchText = baseURL + enteredSearchText + "&entity=musicArtist&limit=5";
		@SuppressWarnings("unused")
		String qs;
		
		//setting up the UTF-8 based encoding
		try{
			qs = URLEncoder.encode(baseURL, "UTF-8");
		}catch(Exception e){
			Log.e("Bad Url", "Encoding problem");
			qs = "";
		}
		
		URL finalURL;
		try{
			//finalURL = new URL(baseURL + "?q=" + qs + "&format=json");
			
			// dont actually need my UTF-8 involved in the url
			finalURL = new URL(withEnteredSearchText);
			infoRequest newRequest = new infoRequest();
			newRequest.execute(finalURL);
			
		}catch(MalformedURLException e){
			Log.e("Bad Url", "malformed URL");
			finalURL = null;
		}
		
		
	}
	
	private class infoRequest extends AsyncTask<URL, Void, String>{

		@Override
		protected String doInBackground(URL... urls) {
			String response = "";
			for(URL url: urls){
				response = WebInfo.getURLStringResponse(url);
			}
			
			return response;
		}
		
		protected void onPostExecute(String result){
			Log.i("URL Response", result);
			
			
			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
