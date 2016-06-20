package com.example.mobileappdevelop.menu;

import android.support.v7.app.AppCompatActivity;
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


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    public void Display(MenuItem item) {
        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_LONG ).show();
    }
    public void Help() {
        Toast.makeText(MainActivity.this, "Help Button is pressed", Toast.LENGTH_LONG ).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.help)  Help();
        else if(item.getItemId() == R.id.settings)  Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_LONG ).show();
        return super.onOptionsItemSelected(item);
    }


}
