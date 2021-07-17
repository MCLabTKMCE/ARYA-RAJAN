package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView Vname,Vemail;
    Button btnLogout;

    SharedPreferences share;
    private static final String SHARED_PREF_NAME="preference";
    private static final String KEY_NAME="name";
    private static final String KEY_EMAIL="email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Vname=findViewById(R.id.Vname);
        Vemail=findViewById(R.id.Vemail);
        btnLogout=findViewById(R.id.btnLogout);


        share=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        String name = share.getString(KEY_NAME,null);
        String email = share.getString(KEY_EMAIL,null);

        if (name != null || email != null){
            Vname.setText(name);
            Vemail.setText(email);
        }
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = share.edit();
                editor.clear();
                editor.commit();
                Toast.makeText(MainActivity2.this,"Logout Successfully",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}