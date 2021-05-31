package com.example.fib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number;
    Button fib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView)findViewById(R.id.result);
        number=(EditText)findViewById(R.id.number);
        fib=(Button)findViewById(R.id.fib);
        fib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num;
                int f1=0;
                int f2=1;
                int f3=0;
                num=Integer.parseInt(number.getText().toString());
                if(num<1) {
                    result.setText(String.valueOf("0"));
                }
                else{
                    result.setText(String.valueOf(" "+f1+" ,"+f2));
                    for(int i=2;i<=num;i++) {
                        f3 = f1 + f2;
                        f1 = f2;
                        f2 = f3;
                        result.append(" "+String.valueOf(f3));

                    }
                }

            }
        });
    }
}



