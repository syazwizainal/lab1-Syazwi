package com.syazwi.lab1_syazwi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.textView);
        submitButton = findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);

    }

    @SuppressLint("SetTextI18n")
    public void displayText(View view){
       String text = etName.getText().toString();
        tvMessage.setText("Welcome! " + text);

        Toast toast = Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT);
        toast.show();
    }
}