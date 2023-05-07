package com.example.slip3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBoxMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxMovies = findViewById(R.id.checkboxMovies);
        checkBoxMovies.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked) {
                // display the result in an alert dialog box
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Watching");
                builder.setMessage("Movies");
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        }));
    }
}