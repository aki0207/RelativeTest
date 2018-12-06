package com.example.relativetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int text_size = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mini_size_button = (Button)findViewById(R.id.size_mini);
        Button medium_size_button = (Button)findViewById(R.id.size_medium);
        Button large_size_button = (Button)findViewById(R.id.size_large);


        textView = (TextView)findViewById(R.id.textView);


        mini_size_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*textView = (TextView)findViewById(R.id.textView);
                textView.setTextSize(5);*/
                text_size = 0;
                setSize(textView,text_size);
            }
        });

        medium_size_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*textView = (TextView)findViewById(R.id.textView);
                textView.setTextSize(20);*/
                text_size = 1;
                setSize(textView,text_size);
            }
        });

        large_size_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*textView = (TextView)findViewById(R.id.textView);
                textView.setTextSize(40);*/
                text_size = 2;
                setSize(textView,text_size);
            }
        });

    }

    public void setSize(TextView pTextView,int pTextSize){

        pTextView = (TextView)findViewById(R.id.textView);

        if (pTextSize == 0) {
            pTextView.setTextSize(5);
        } else if (pTextSize == 1) {
            pTextView.setTextSize(20);
        } else if (pTextSize == 2) {
            pTextView.setTextSize(40);
        }


    }
}
