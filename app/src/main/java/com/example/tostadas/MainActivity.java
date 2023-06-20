package com.example.tostadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListener();



    }

    private void initListener() {

        Button toastB = findViewById(R.id.buttonToast);
        Button clickB = findViewById(R.id.buttonCount);
        TextView showCount = findViewById(R.id.showCount);

        toastB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Hello Toast", Toast.LENGTH_SHORT).show();
            }
        });

        clickB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer contador = Integer.parseInt(showCount.getText().toString()) + 1;
                showCount.setText(contador);
            }
        });
    }
}