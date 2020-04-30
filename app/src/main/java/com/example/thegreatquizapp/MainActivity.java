package com.example.thegreatquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    RadioGroup rg1;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        rg1=findViewById(R.id.rg1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rg1.getCheckedRadioButtonId()==R.id.rb1){
                score++;
                }
                else{
                    score=score+0;
                }

                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("q_score",score);
                startActivity(i);
            }
        });
    }
}
