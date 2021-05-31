package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Vname,Vaddress,Vage,Vgender,Vphone;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Vname=findViewById(R.id.Vname);
        Vaddress=findViewById(R.id.Vaddress);
        Vage=findViewById(R.id.Vage);
        Vgender=findViewById(R.id.Vgender);
        Vphone=findViewById(R.id.Vphone);
        btnBack=findViewById(R.id.btnBack);

        Intent value=getIntent();
        String n=value.getStringExtra("name");
        String a=value.getStringExtra("address");
        String age=value.getStringExtra("age");
        String g=value.getStringExtra("gender");
        String p=value.getStringExtra("phone");

        Vname.setText(n);
        Vaddress.setText(a);
        Vage.setText(age);
        Vgender.setText(g);
        Vphone.setText(p);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}
