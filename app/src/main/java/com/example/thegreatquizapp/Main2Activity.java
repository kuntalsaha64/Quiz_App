package com.example.thegreatquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button btn2;
    RadioGroup rg2;
    TextView result;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2=findViewById(R.id.btn2);
        rg2=findViewById(R.id.rg2);
        result=findViewById(R.id.result);

        score=getIntent().getIntExtra("q_score",0);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rg2.getCheckedRadioButtonId()==R.id.rb8){
                    score++;
                }
                else{
                    score=score+0;
                }
                result.setText(Integer.toString(score));
            }
        });
    }
}
