package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editname,editaddress,editage,editphone;
    Button btnS,btnR;
    RadioGroup Rgender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editname=findViewById(R.id.editname);
        editaddress=findViewById(R.id.editaddress);
        editage=findViewById(R.id.editage);
        editphone=findViewById(R.id.editphone);
        btnS=findViewById(R.id.btnS);
        btnR=findViewById(R.id.btnR);
        Rgender=findViewById(R.id.Rgender);
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = editname.getText().toString();
                String a = editaddress.getText().toString();
                String ag = editage.getText().toString();
                String p = editphone.getText().toString();
                String g = ((RadioButton) findViewById(Rgender.getCheckedRadioButtonId())).getText().toString();

                Intent page = new Intent(MainActivity.this, MainActivity2.class);
                page.putExtra("name", n);
                page.putExtra("address", a);
                page.putExtra("age", ag);
                page.putExtra("phone", p);
                page.putExtra("gender", g);
                startActivity(page);
                Toast.makeText(MainActivity.this,"Record Submitted",Toast.LENGTH_SHORT).show();
            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent clear=new Intent(MainActivity.this,MainActivity.class);
                startActivity(clear);

            }
        });
    }
}
