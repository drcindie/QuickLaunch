package com.cindiemarren.quicklaunch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // OUR FIRST CODE HERE - LAUNCH TO ACTIVITY INSIDE OUR APP///////
        // LAUNCH TO SECOND PAGE
        Button secondActivityBtn = (Button)findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                        // New Intent Class called startIntent. Get app content from SecondActivity
                startIntent.putExtra("com.cindiemarren.quickLaunch.SOMETHING", "I love John! He's the best husband!");
                        // putExtra adds info into our intent on other pages
                        // KEY VALUE PAIRS HERE. create a name for key. then value
                        // use your 'package name' for name key
                startActivity(startIntent);
                        // please start this activity called... "startIntent"

            }
        });


        // OUR NEXT CODE HERE - REDIRECT TO WEBSITE OUTSIDE OUR APP/////////
        //  Attempt to launch TO GOOGLE
        Button googleBtn = (Button)findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // this is the URL it will go to. can change to anything
                String google = "http://www.google.com";
                //must parse here as a Uri - universal web address
                //parse the string called 'google'
                Uri webaddress = Uri.parse(google);
                //need to create an intent: launch something on
                //our device that can brows to that webpage

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                // IF statement to test if there is a device that can
                // run our request. Need response... not null
                if (gotoGoogle.resolveActivity(getPackageManager()) !=null) {
                    startActivity(gotoGoogle);
                }
            }
        });

    }
}













