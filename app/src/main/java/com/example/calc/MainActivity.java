package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button op, btn,l,abc;
    EditText num1, num2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op = findViewById(R.id.jh);
        l=findViewById(R.id.AT);
        abc=findViewById(R.id.SP);
        num1 = findViewById(R.id.war);
        num2 = findViewById(R.id.car);
        res = findViewById(R.id.home);
        btn = findViewById(R.id.RASCAL);

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2, result;
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                result = Math.abs(n1-n2);
                res.setText(String.valueOf(result));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2, result;
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                result = Math.abs(n1 + n2);
                res.setText(String.valueOf(result));
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2, result;
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                result = Math.abs(n1 * n2);
                res.setText(String.valueOf(result));
            }
        });

        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2, result;
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                result = Math.abs(n1 / n2);
                res.setText(String.valueOf(result));
            }
        });
    }
}