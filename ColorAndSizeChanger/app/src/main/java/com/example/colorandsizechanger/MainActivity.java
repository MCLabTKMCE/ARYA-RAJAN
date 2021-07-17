package com.example.colorandsizechanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    Button btnS,btnC,btnR;
    int[] color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=findViewById(R.id.edit1);
        btnS=findViewById(R.id.btnS);
        btnC=findViewById(R.id.btnC);
        btnR=findViewById(R.id.btnR);
        color=new int[] { Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW,Color.CYAN};

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setTextSize(edit1.getTextSize()+1);

            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setTextSize(20);
                edit1.setTextColor(Color.BLACK);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int arrylength=color.length;
                Random r=new Random();
                int rnum=r.nextInt(arrylength);
                edit1.setTextColor(color[rnum]);
            }
        });
    }
}