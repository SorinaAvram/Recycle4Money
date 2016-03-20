package com.avram.sorina.recycle4money;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class QuantityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantity);

       //setContentView(textView);

    }
    public void NextMessage1(View view) {
        Intent startNewActivity = new Intent(this, Currency_selector.class);
        startActivity(startNewActivity);
    }

}
