package com.example.slip8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTxtNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtNum = findViewById(R.id.num);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.main_menu, menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.calculate_factorial:
                int number = Integer.parseInt(editTxtNum.getText().toString());
                long factorial = calculateFactorial(number);
                Toast.makeText(this, "Factorial of " + number + " is " + factorial, Toast.LENGTH_SHORT).show();
                return true;

            case 2:
                int number2 = Integer.parseInt(editTxtNum.getText().toString());
                long cube = number2 * number2 * number2;
                Toast.makeText(this, "Cube of " + number2 + " is " + cube, Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }

    private long calculateFactorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}