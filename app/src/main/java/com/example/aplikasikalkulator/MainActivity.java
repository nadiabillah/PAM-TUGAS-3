package com.example.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonClear;

    float valueOne, valueTwo;
    boolean add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi EditText dan Buttons
        editText = findViewById(R.id.editText);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonClear = findViewById(R.id.buttonClear);

        // Tombol Angka
        button0.setOnClickListener(v -> editText.append("0"));
        button1.setOnClickListener(v -> editText.append("1"));
        button2.setOnClickListener(v -> editText.append("2"));
        button3.setOnClickListener(v -> editText.append("3"));
        button4.setOnClickListener(v -> editText.append("4"));
        button5.setOnClickListener(v -> editText.append("5"));
        button6.setOnClickListener(v -> editText.append("6"));
        button7.setOnClickListener(v -> editText.append("7"));
        button8.setOnClickListener(v -> editText.append("8"));
        button9.setOnClickListener(v -> editText.append("9"));

        // Tombol Operasi
        buttonAdd.setOnClickListener(v -> {
            valueOne = Float.parseFloat(editText.getText().toString());
            add = true;
            editText.setText("");
        });

        buttonSubtract.setOnClickListener(v -> {
            valueOne = Float.parseFloat(editText.getText().toString());
            subtract = true;
            editText.setText("");
        });

        buttonMultiply.setOnClickListener(v -> {
            valueOne = Float.parseFloat(editText.getText().toString());
            multiply = true;
            editText.setText("");
        });

        buttonDivide.setOnClickListener(v -> {
            valueOne = Float.parseFloat(editText.getText().toString());
            divide = true;
            editText.setText("");
        });

        // Tombol Hasil (=)
        buttonEquals.setOnClickListener(v -> {
            valueTwo = Float.parseFloat(editText.getText().toString());

            if (add) {
                editText.setText(valueOne + valueTwo + "");
                add = false;
            }

            if (subtract) {
                editText.setText(valueOne - valueTwo + "");
                subtract = false;
            }

            if (multiply) {
                editText.setText(valueOne * valueTwo + "");
                multiply = false;
            }

            if (divide) {
                editText.setText(valueOne / valueTwo + "");
                divide = false;
            }
        });

        // Tombol Clear (C)
        buttonClear.setOnClickListener(v -> editText.setText(""));
    }
}