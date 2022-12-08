package com.example.examen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class SevenActivity extends AppCompatActivity implements View.OnClickListener  {

    public static int anxietyScore = SixActivity.anxietyScore;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_seven);

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
                anxietyScore = SixActivity.anxietyScore;
//                Toast.makeText(this, "Anxiety Score:" + anxietyScore, Toast.LENGTH_SHORT).show();
                openActivityResult();
                break;

            case R.id.button_several_days:
                anxietyScore = SixActivity.anxietyScore + 1;
//                Toast.makeText(this, "Anxiety Score:" + anxietyScore, Toast.LENGTH_SHORT).show();
                openActivityResult();
                break;

            case R.id.button_more_than_half_days:
                anxietyScore = SixActivity.anxietyScore + 2;
//                Toast.makeText(this, "Anxiety Score:" + anxietyScore, Toast.LENGTH_SHORT).show();
                openActivityResult();
                break;

            case R.id.button_nearly_every_day:
                anxietyScore = SixActivity.anxietyScore + 3;
//                Toast.makeText(this, "Anxiety Score:" + anxietyScore, Toast.LENGTH_SHORT).show();
                openActivityResult();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
    public void openActivityResult() {
        if (anxietyScore < 5) {
            Intent intent = new Intent(SevenActivity.this, ResultNormalActivity.class);
            startActivity(intent);
        }
        if ((anxietyScore < 10) && (anxietyScore >= 5)) {
            Intent intent = new Intent(SevenActivity.this, ResultMildActivity.class);
            startActivity(intent);
        }
        if ((anxietyScore < 15) && (anxietyScore >= 10)) {
            Intent intent = new Intent(SevenActivity.this, ResultModerateActivity.class);
            startActivity(intent);
        }
        if (anxietyScore >= 15) {
            Intent intent = new Intent(SevenActivity.this, ResultSevereActivity.class);
            startActivity(intent);
        }
    }
}

