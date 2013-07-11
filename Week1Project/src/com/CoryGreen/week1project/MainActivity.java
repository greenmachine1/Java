/*
 * Project		Week1Project
 * 
 * Package		com.CoryGreen.week1project
 * 
 * @author		Cory Green
 * 
 * date			Jul 11, 2013
 */
package com.CoryGreen.week1project;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {
	
	// defining outside params
	LinearLayout ll;
	LinearLayout.LayoutParams lp;
	EditText et;
	TextView result;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      
        // setting up the layout of my program
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(lp);
        
        
        // Here Ill ask the user to provide their name
        
        
        
     // setting the ll to the contentView
 		setContentView(ll);
        
        
        
        
        
        
     /*
     // setting my layout parameters
     		ll = new LinearLayout(this);
     		ll.setOrientation(LinearLayout.VERTICAL);
     		lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
     		ll.setLayoutParams(lp);
     		
     		
     		
     		TextView tv = new TextView(this);
     		tv.setText("This is an example TextView");
     		
     		// adding "this is an example TextView to my main linear layout view"
     		ll.addView(tv);
     		
     		
     		// my edit text area
     		et = new EditText(this);
     		
     		// sets a hint for the text edit area
     		// accesses our Resource values (R.string)
     		et.setHint("Type something here");
     		
     		et.getText();
     		
     		
     		
     		// adding my edit text to the linearLayout
     		//ll.addView(et);
     		
     		// my button 
     		Button b = new Button(this);
     		
     		// sets the button text to Do something
     		b.setText("This is a button");
     		
     		// adding my button to the linear layout
     		//ll.addView(b);
 
     		b.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					// this puts the users entry into string format
					String entry = et.getText().toString();
					
					// sets the result to equal that of the string
					result.setText(entry);
				}
			});
     		
     		// creating a new linear layout
     		LinearLayout form = new LinearLayout(this);
     		
     		// Horizontal is the default layout
     		form.setOrientation(LinearLayout.HORIZONTAL);
     		lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
     		form.setLayoutParams(lp);
     		
     		form.addView(et);
     		form.addView(b);
     		
     		ll.addView(form);
     		
     		result = new TextView(this);
     		ll.addView(result);
     		
     		
     		// setting the ll to the contentView
     		setContentView(ll);
        */
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
