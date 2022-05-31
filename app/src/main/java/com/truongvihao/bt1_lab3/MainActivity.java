package com.truongvihao.bt1_lab3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button seetime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog ad=new AlertDialog.Builder(this).create();

        seetime=findViewById(R.id.seeTime);

        seetime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date t=new Date();
                String message="Thoi gian hien hanh"+t.toString();
                ad.setMessage(message);
                ad.show();
            }
        });
    }
}