package com.cindiemarren.quicklaunch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // verify yor app opens to page one, not page 2,3,4..
        if (getIntent().hasExtra("com.cindiemarren.quickLaunch.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.oneEditText);
            String text123 = getIntent().getExtras().getString("com.cindiemarren.quickLaunch.SOMETHING");
            tv.setText(text123);

        }


    }
}
