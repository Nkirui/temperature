package com.example.karugo.tempoconverter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText temp;
    RadioButton toC;
    RadioButton toF;
    TextView title;
    //private android.app.AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = (EditText) findViewById(R.id.TempEditText);
        toC = (RadioButton) findViewById(R.id.toCelsiusRadioButton);
        toF = (RadioButton) findViewById(R.id.toFahrenheitRadioButton);

    }

    public void Calculate(View v) {
        double value = new Double(temp.getText().toString());

        if (toF.isChecked())
            value = unitConverter.celsiusToFahrenheit((Double) value);

        else
            value = unitConverter.fahrenheitToCelsius((Double) value);
        temp.setText(new Double(value).toString());
    }

    public void showAlert(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);


        myAlert.setTitle("Temp app By: Nathan Kirui");

        AlertDialog.Builder builder = myAlert.setMessage("Welcome hommy!!");

        myAlert.setPositiveButton("close",new DialogInterface.OnClickListener(){


                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();

                    }
                });


        myAlert.show();


    }
}






