package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView res;
    Button find;

    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=(EditText)findViewById(R.id.num);
        find=(Button)findViewById(R.id.find);
        res=(TextView)findViewById(R.id.res);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(num.getText().toString());
                int fact=1;
                if(number<1){
                    res.setText(String.valueOf("0"));
                }
                else {
                    for (int i = 1; i <= number; i++) {
                        fact = fact * i;
                    }
                    res.setText(String.valueOf(fact));
                }
            }
        });
    }
}

