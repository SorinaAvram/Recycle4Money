package com.avram.sorina.recycle4money;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener{
Spinner spinner;


       @Override
    protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.content_main);

           spinner= (Spinner)findViewById(R.id.spinner);
           ArrayAdapter adapter= ArrayAdapter.createFromResource(this, R.array.recyclable_materials, android.R.layout.simple_spinner_item);
           spinner.setAdapter(adapter);
           spinner.setOnItemSelectedListener(this);
       }

    public void NextMessage(View view) {
        Intent startNewActivity = new Intent(this,QuantityActivity.class);
        startActivity(startNewActivity);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            TextView myText= (TextView) view;
            Toast.makeText(this,"You Selected "+myText.getText(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    }


