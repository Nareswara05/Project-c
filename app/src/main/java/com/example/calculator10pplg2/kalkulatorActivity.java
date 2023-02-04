package com.example.calculator10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kalkulatorActivity extends AppCompatActivity {
    Button tambah, kurang, bagi, kali, clear, logout;
    EditText txt1, txt2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layiuut);
        // konekkan semua komponen dengan xml nya
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        bagi = findViewById(R.id.bagi);
        kali = findViewById(R.id.kali);
        clear = findViewById(R.id.clear);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        logout = findViewById(R.id.logout);

        result = findViewById(R.id.result);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toast
                if (txt1.getText().toString().equals("")){
                    Toast.makeText(kalkulatorActivity.this, "Mohon Masukan Angka", Toast.LENGTH_SHORT).show();
                }else if(txt2.getText().toString().equals("")){
                    Toast.makeText(kalkulatorActivity.this, "Mohon Masukan Angka", Toast.LENGTH_SHORT).show();
                }
                else {
                    float a, b, c;
                    a = Float.parseFloat(txt1.getText().toString());
                    b = Float.parseFloat(txt2.getText().toString());
                    c = a + b;
                    result.setText("Hasilnya adalah " + c);

                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toast
                if (txt1.getText().toString().equals("")){
                    Toast.makeText(kalkulatorActivity.this, "Mohon Masukan Angka", Toast.LENGTH_SHORT).show();
                }else if(txt2.getText().toString().equals("")){
                    Toast.makeText(kalkulatorActivity.this, "Mohon Masukan Angka", Toast.LENGTH_SHORT).show();
                }
                else {
                    float a, b, c;
                    a = Float.parseFloat(txt1.getText().toString());
                    b = Float.parseFloat(txt2.getText().toString());
                    c = a - b;
                    result.setText("Hasilnya adalah " + c);

                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt1.getText().toString().equals("")){
                    Toast.makeText(kalkulatorActivity.this, "Mohon Masukan Angka ", Toast.LENGTH_SHORT).show();
                }else if(txt2.getText().toString().equals("")){
                    Toast.makeText(kalkulatorActivity.this, "Mohon Masukan Angka", Toast.LENGTH_SHORT).show();
                }
                else {
                    float a, b, c;
                    a = Float.parseFloat(txt1.getText().toString());
                    b = Float.parseFloat(txt2.getText().toString());
                    c = a / b;
                    result.setText("Hasilnya adalah " + c);
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.getText().toString().equals("")){
                    Toast.makeText(kalkulatorActivity.this, "Mohon Masukan Angka", Toast.LENGTH_SHORT).show();
                }else if(txt2.getText().toString().equals("")){
                    Toast.makeText(kalkulatorActivity.this, "Mohon Masukan Angka ", Toast.LENGTH_SHORT).show();
                }
                else {
                    float a, b, c;
                    a = Float.parseFloat(txt1.getText().toString());
                    b = Float.parseFloat(txt2.getText().toString());
                    c = a * b;
                    result.setText("Hasilnya adalah " + c);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
                txt2.setText("");
                result.setText("");
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kalkulatorActivity.this, MainActivity.class));
            }
        });


    }
}