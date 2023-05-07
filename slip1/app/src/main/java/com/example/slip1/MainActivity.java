package com.example.slip1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import static java.lang.Math.pow;
/**
 * Create a Simple Application which shows the Life Cycle of Activity.
 */
public class MainActivity extends AppCompatActivity {
    String tag = "Activity Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate() method called");
    }

    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart() method called");
        System.out.println("onStart() method called");
    }

    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume() method called");
        System.out.println("onResume() method called");
    }

    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause() method called");
        System.out.println("onPause() method called");
    }

    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop() method called");
        System.out.println("onStop() method called");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy() method called");
        System.out.println("onDestroy() method called");
    }

    public void HandleClick(View v) {
        double inputRate = 0.0;
        double convertedRate = 0.0;
        EditText inputText = findViewById(R.id.editRate);
        TextView convertedText = findViewById(R.id.txtConvertedRate);
        try {
            inputRate = Double.parseDouble(inputText.getText().toString()) / 100.0;
        } catch (Exception ex) {
            inputText.setText("0.0");
        }

        if (((findViewById(R.id.radioMonthly)).createAccessibilityNodeInfo().isChecked())) {
            //If converting to monthly
            convertedRate = (pow((1.0 + inputRate), (1.0 / 12.0)) - 1.0) * 100.0;
        } else {
            //Converting to yearly
            convertedRate = (pow((1.0 + inputRate), 12) - 1.0) * 100.0;
        }
        convertedText.setText(String.format("Converted Rate is %1$.4f%%", convertedRate));
    }

}