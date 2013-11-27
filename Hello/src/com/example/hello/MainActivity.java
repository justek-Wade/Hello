package com.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    //sdfdfdf
    //
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	//
    	//Wade add a line2

    	System.out.println("wade");
       //github.com/justek-Wade/Hello.git
    	super.onResume();
    }
    
}
