package com.example.user.lab12bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight, editTextHeight;
    private ImageView imageViewResult;
    private TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        imageViewResult = (ImageView) findViewById(R.id.imageViewResult);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
    }

    public void calculateBMI(View view){
        double weight, height, result;

        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());

        result = weight/height;

        if(result<=18.5) {
            imageViewResult.setImageResource (R.drawable.under);
            textViewResult.setText("under weight");
        }else if (result>18.5 && result<21 )
        {
            imageViewResult.setImageResource (R.drawable.normal);
            textViewResult.setText("normal");
        }else
        {
            imageViewResult.setImageResource (R.drawable.over);
            textViewResult.setText("over weight");
        }
    }

    public void reset(View view){
        editTextWeight.setText("");
        editTextHeight.setText("");
        imageViewResult.setImageResource (R.drawable.empty);
        textViewResult.setText("");
    }
}
