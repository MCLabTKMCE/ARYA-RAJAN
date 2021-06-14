package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //first create resourse file directory(res->right click new->resourse diretc)
        //create resourse file for menu(menu->right click new->menu resourse file)
        //create override method for menu
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //this method will inflate our menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items,menu);
        return true;
    }
    // now create item selected menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.copy:
                Toast.makeText(this, "copied....",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(this, "shared....",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.setting:
                Toast.makeText(this, "setting..",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Detail:
                Toast.makeText(this, "detail....",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.about:
                Toast.makeText(this, "about....",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}