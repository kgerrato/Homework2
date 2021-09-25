package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView1, mTextView2, mTextView3, mTextView4, mTextView5, mTextView6; //textview, edittext and button set up so we can use them later
    EditText mEditText1, mEditText2, mEditText3, mEditText4, mEditText5;
    Button mButton1, mButton2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = (TextView) findViewById(R.id.g1); //each one set up by their id from the xml
        mTextView2 = (TextView) findViewById(R.id.g2);
        mTextView3 = (TextView) findViewById(R.id.g3);
        mTextView4 = (TextView) findViewById(R.id.g4);
        mTextView5 = (TextView) findViewById(R.id.g5);

        mTextView6 = (TextView) findViewById(R.id.gpa);


        mEditText1 = (EditText) findViewById(R.id.e1);
        mEditText2 = (EditText) findViewById(R.id.e2);
        mEditText3 = (EditText) findViewById(R.id.e3);
        mEditText4 = (EditText) findViewById(R.id.e4);
        mEditText5 = (EditText) findViewById(R.id.e5);

        mButton1 = (Button) findViewById(R.id.b1);

    }

    public void calculateGPA(View v) { //used to calculate the gpa when you hit the calculate button, if fields are empty, tell the user to enter in the fields
        if (mEditText1.getText().toString().isEmpty() ||
                mEditText2.getText().toString().isEmpty() ||
                mEditText3.getText().toString().isEmpty() ||
                mEditText4.getText().toString().isEmpty() ||
                mEditText5.getText().toString().isEmpty()) {
            mTextView6.setText("Please enter in a grade in all fields");
        }
        else {
            float g1, g2, g3, g4, g5; //all the variables for the grades to calculate the avg
            g1 = Float.parseFloat(mEditText1.getText().toString());
            g2 = Float.parseFloat(mEditText2.getText().toString());
            g3 = Float.parseFloat(mEditText3.getText().toString());
            g4 = Float.parseFloat(mEditText4.getText().toString());
            g5 = Float.parseFloat(mEditText5.getText().toString());

            float avg = g1 + g2 + g3 + g4 + g5;
            avg = avg / 5;

            mButton1.setText("Clear Form"); //changes the text to clearform


            if (avg < 60) { //if below 60, color red, ect.
                mTextView6.setText("" + avg);
                ;
                mTextView6.setBackgroundColor(Color.RED);
            } else if (avg > 60 && avg < 80) {
                mTextView6.setText("" + avg);
                ;
                mTextView6.setBackgroundColor(Color.YELLOW);
            } else if (avg >= 80 && avg <= 100) {
                mTextView6.setText("" + avg);
                ;
                mTextView6.setBackgroundColor(Color.GREEN);
            }
        }
    }
}
