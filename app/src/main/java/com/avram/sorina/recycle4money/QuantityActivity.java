package com.avram.sorina.recycle4money;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class QuantityActivity extends Activity{

    EditText editText4;
    TextView qs;
    Button n1Button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_quantity);

       //final EditText editText4 = (EditText)findViewById(R.id.editText4);
   Button n1Button = (Button)findViewById(R.id.n1Button);
       n1Button.setOnClickListener(new View.OnClickListener() {

       // @Override
        public void onClick(View v) {


           //String quantity_number = editText4.getText().toString();


            Intent startNewActivity1 = new Intent(QuantityActivity.this, Currency_selector.class);
            //startNewActivity1.putExtra("get_spinner", getIntent());
            //startNewActivity1.putExtra("get_quantity", quantity_number);
            startActivity(startNewActivity1);
        }
    });
    }
    }

