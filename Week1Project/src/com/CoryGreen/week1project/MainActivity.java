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
	
	EditText et;
	EditText firstNumber;
	EditText secondNumber;
	EditText thirdNumber;
	
	int first;
	int second;
	int third;
	
	String name;
	
	TextView nameResult;
	TextView numberResult;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      
        // setting up the layout of my program
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(lp);
        
        
        // Here Ill ask the user to provide their name
        TextView nameTextView = new TextView(this);
        nameTextView.setText(R.string.enter);
        ll.addView(nameTextView); // adding the nameTextView to ll
        
        // adding the name field to the view
        et = new EditText(this);
        ll.addView(et);
        
        Button nameDoneButton = new Button(this);
        
        // using my Java resource string for the word done! since I use it more than once :)
        nameDoneButton.setText(R.string.done);
        ll.addView(nameDoneButton);
        
        
        // this handles when the person clicks on done for when they are done entering in 
        // their name
        nameDoneButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// putting the users name into a string
				name = et.getText().toString();
				
				nameResult.setText("Ok "+name+", now enter in 3 random numbers to sort.");
				
			}
		});
        
        // adding a text view for the persons name
        nameResult = new TextView(this);
        ll.addView(nameResult);
        
        
        // adding my number fields
        firstNumber = new EditText(this);
        ll.addView(firstNumber);
        
        secondNumber = new EditText(this);
        ll.addView(secondNumber);
        
        thirdNumber = new EditText(this);
        ll.addView(thirdNumber);
        
        Button numberDoneButton = new Button(this);
        numberDoneButton.setText(R.string.done);
        ll.addView(numberDoneButton);
        
        // this button will handle the done button for the numbers to be sorted
        numberDoneButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// putting the numbers provided by the user into int values
				first = Integer.parseInt(firstNumber.getText().toString());
				second = Integer.parseInt(secondNumber.getText().toString());
				third = Integer.parseInt(thirdNumber.getText().toString());
				
				// calling on my returnSortedNumbers function
				numberResult.setText(returnSortedNumbers(first, second, third));
				
			}
		});
        
        
        numberResult = new TextView(this);
        ll.addView(numberResult);
        
        
        
        // setting the ll to the contentView
 		setContentView(ll);
    }

    // this is a method used to sort the three numbers passed in
    public String returnSortedNumbers(int first, int second, int third)
    {
    	int number1 = 0;
    	int number2 = 0;
    	int number3 = 0;
    	
    	// this doesnt work as intended.  Still need to focus on.
    	for(int i = 0; i < 2; i++)
    	{
    		if(first > second)
    		{
    			number1 = second;
    			number2 = first;
    			
    			if(first > third)
    			{
    				number1 = third;
    				number3 = first;
    			}
    			else if(first < third)
    			{
    				number1 = first;
    				number3 = third;
    			}
    		}
    		else if(first < second)
    		{
    			number1 = first;
    			number2 = second;
    			
    			if(second > third)
    			{
    				number2 = third;
    				number3 = second;
    			}
    			else if(second < third)
    			{
    				number2 = second;
    				number3 = third;
    			}
    		}
    		
    	}
    	
    	// creating my return string
    	String tempReturnString = "Your numbers " + name +" are " + number1 + " " + number2 + " " + number3;
    	
    	return tempReturnString;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
