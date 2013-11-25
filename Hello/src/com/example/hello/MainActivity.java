package com.example.hello;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

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
<<<<<<< HEAD
    //
=======
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    }
>>>>>>> f48427489b6d6d8ab923705b993cf7af8a2d5dec
}
