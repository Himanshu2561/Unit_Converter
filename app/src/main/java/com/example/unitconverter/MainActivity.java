package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView1);
//            button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////              Toast.makeText(MainActivity.this, "Hii listener worked!", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                double kg = Double.parseDouble(s);
//                double pound = 2.205 * kg;
//                textView.setText("The corresponding value in Pounds is " + pound);
//            }
//        });
    }
    public void calculate(View view){
        double kg = Double.parseDouble(editText.getText().toString());
        double pound = 2.205 * kg;
        textView.setText("The corresponding value in Pounds is " + pound);
        Toast.makeText(this, "Thanks for using the App.", Toast.LENGTH_SHORT).show();

    }
}