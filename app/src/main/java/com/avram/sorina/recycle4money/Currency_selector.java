package com.avram.sorina.recycle4money;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Currency_selector extends Activity implements AdapterView.OnItemSelectedListener {

    Spinner spinner_country;
    Spinner currency_selector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_currency_selector);


        spinner_country = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.spinner_country, android.R.layout.simple_spinner_item);
        spinner_country.setAdapter(adapter);
        spinner_country.setOnItemSelectedListener(this);

        currency_selector = (Spinner) findViewById(R.id.currency_selector);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.currency_selector, android.R.layout.simple_spinner_item);
        currency_selector.setAdapter(adapter1);
        currency_selector.setOnItemSelectedListener(this);
    }


    Intent startNewActivity = new Intent(this, Calculate.class);

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText = (TextView) view;
        Toast.makeText(this, "You Selected " + myText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
