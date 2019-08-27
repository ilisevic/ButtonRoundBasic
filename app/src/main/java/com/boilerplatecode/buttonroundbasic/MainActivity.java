package com.boilerplatecode.buttonroundbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btnRound);
        btn2=findViewById(R.id.btnRound2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Dugme1- rectangle zašiljeni", Toast.LENGTH_LONG).show();
                btn1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Dugme2- oval", Toast.LENGTH_LONG).show();
                btn1.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        });



    }
}
