package com.example.student.baitap1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText soa, sob;
    Button btntong, btnhieu, btntich, btnthuong, btnthoat, btnucln;
    TextView kq;
     int firstNumber, secondNumber, temp1, temp2, uscln, bscnn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        soa = findViewById(R.id.soa);
        sob = findViewById(R.id.sob);
        btntong = findViewById(R.id.btntong);
        btnhieu = findViewById(R.id.btnhieu);
        btntich = findViewById(R.id.btntich);
        btnthuong = findViewById(R.id.btnthuong);
        btnthoat = findViewById(R.id.btnthoat);
        btnucln = findViewById(R.id.btntucln);
        kq = findViewById(R.id.kq);

        btntong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hsoa = Integer.parseInt(soa.getText().toString());
                int hsob = Integer.parseInt(sob.getText().toString());
                int tong = hsoa+hsob;
                kq.setText("Tổng: "+tong);
            }
        });

        btnhieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hsoa = Integer.parseInt(soa.getText().toString());
                int hsob = Integer.parseInt(sob.getText().toString());
                int hieu = hsoa-hsob;
                kq.setText("Hiệu: "+hieu);
            }
        });
        btntich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hsoa = Integer.parseInt(soa.getText().toString());
                int hsob = Integer.parseInt(sob.getText().toString());
                int tich = hsoa*hsob;
                kq.setText("Tích: "+tich);
            }
        });

        btnthuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hsoa = Integer.parseInt(soa.getText().toString());
                int hsob = Integer.parseInt(sob.getText().toString());
                int thuong = hsoa/hsob;
                kq.setText("Thương: "+thuong);
            }
        });
        btnucln.setOnClickListener(new View.OnClickListener() {
            Scanner scann;
            @Override
            public void onClick(View view) {
                int hsoa = Integer.parseInt(soa.getText().toString());
                int hsob = Integer.parseInt(sob.getText().toString());

                while ((firstNumber <=0)||(secondNumber <=0) ){

                    firstNumber = scann.nextInt();
                    secondNumber = scann.nextInt();


                    temp1= firstNumber;
                    temp2 = secondNumber;

                    while (temp1 !=temp2){
                        if(temp1 > temp2){
                            temp1 -= temp2;
                        }else {
                            temp2 -= temp1;

                        }
                    }
                    uscln= temp1;

                    kq.setText("Ước chung lớn nhất: "+ firstNumber +"và"+ secondNumber + "và"+ uscln);
                }
            }
        });

        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

}
