package com.example.examen;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



// variables declaration
public class MainActivity2 extends AppCompatActivity {
    private Button button;
    public static int anxietyScore = 0;
    EditText editPrice1, editPriace2, editContent1, editContent2;
    String stringPrice1, stringPrice2, stringContent1, stringContent2, resultSummary, resultResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = (Button) findViewById(R.id.buttonStart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityQuestion_One();
            }
        });
    }

    public void openActivityQuestion_One() {
        Intent intent = new Intent(MainActivity2.this, OneActivity.class);
        startActivity(intent);
    }
}

