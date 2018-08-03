package com.acadview.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConvertor(View view){

        Log.i("cc", "currencyConvertor: ");

        EditText editText = (EditText) findViewById(R.id.editText2);
        String amountInPound = editText.getText().toString();
        double amountPoundDouble = Double.parseDouble(amountInPound);
        double amountInDollar = amountPoundDouble * 1.3;
        String amountDollarString = String.format("%.2f",amountInDollar);

        Toast.makeText(this,amountDollarString + " $",Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
