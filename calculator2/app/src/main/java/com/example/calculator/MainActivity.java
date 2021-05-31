package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private TextView textres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        textres=findViewById(R.id.textres);

    }

    public void btnsum(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int sum=n1+n2;
        textres.setText(String.valueOf(sum));

    }

    public void btnsub(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int sum=n1-n2;
        textres.setText(String.valueOf(sum));
    }

    public void btnmul(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int sum=n1*n2;
        textres.setText(String.valueOf(sum));
    }

    public void btndiv(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int sum=n1/n2;
        textres.setText(String.valueOf(sum));
    }
}