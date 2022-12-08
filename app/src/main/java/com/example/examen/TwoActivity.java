package com.example.examen;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class TwoActivity extends AppCompatActivity implements View.OnClickListener  {

    public static int anxietyScore = OneActivity.anxietyScore;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);

        btn1 = findViewById(R.id.button_not_at_all);
        btn2 = findViewById(R.id.button_several_days);
        btn3 = findViewById(R.id.button_more_than_half_days);
        btn4 = findViewById(R.id.button_nearly_every_day);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view)  {
        switch (view.getId()){
            case R.id.button_not_at_all:
                anxietyScore = OneActivity.anxietyScore;
//                Toast.makeText(this, "Anxiety Score:" + anxietyScore, Toast.LENGTH_SHORT).show();
                openActivityQuestion_Three();
                break;

            case R.id.button_several_days:
                anxietyScore = OneActivity.anxietyScore + 1;
//                Toast.makeText(this, "Anxiety Score:" + anxietyScore, Toast.LENGTH_SHORT).show();
                openActivityQuestion_Three();
                break;

            case R.id.button_more_than_half_days:
                anxietyScore = OneActivity.anxietyScore + 2;
//                Toast.makeText(this, "Anxiety Score:" + anxietyScore, Toast.LENGTH_SHORT).show();
                openActivityQuestion_Three();
                break;

            case R.id.button_nearly_every_day:
                anxietyScore = OneActivity.anxietyScore + 3;
//                Toast.makeText(this, "Anxiety Score:" + anxietyScore, Toast.LENGTH_SHORT).show();
                openActivityQuestion_Three();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
    public void openActivityQuestion_Three() {
        Intent intent = new Intent(TwoActivity.this, ThreeActivity.class);
        startActivity(intent);
    }
}