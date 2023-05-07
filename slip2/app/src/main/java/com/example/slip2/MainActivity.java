package com.example.slip2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTxt;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTxt = findViewById(R.id.resultTxt);
        editTxt = findViewById(R.id.editTxt);
    }

    public void checkEvenOdd(View v) {
        int num = Integer.parseInt(editTxt.getText().toString());
        if(num % 2 == 0)
            resultTxt.setText("Number is Even");
        else resultTxt.setText("Number is Odd");
    }

    public void handleSubmit(View v) {
        EditText editTxtFName = findViewById(R.id.editTxtFName);
        Intent intent = new Intent(MainActivity.this, Info.class);
        intent.putExtra("fName", editTxtFName.getText().toString());
        startActivity(intent);
    }
}