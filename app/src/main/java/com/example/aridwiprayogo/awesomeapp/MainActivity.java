package com.example.aridwiprayogo.awesomeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_tambah, btn_kurang;
    TextView tv_score;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tambah = findViewById(R.id.btn_up);
        btn_kurang = findViewById(R.id.btn_down);

        tv_score = findViewById(R.id.tv_score);

        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                tv_score.setText("" + score);
            }
        });

        btn_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score--;
                tv_score.setText(""+ score);
            }
        });
    }
}
