package com.example.s_hili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button btnadd;
    Button btnmin;
    TextView tvdislpay;
    int point=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = (Button) findViewById(R.id.btnplus);

        btnmin = (Button) findViewById(R.id.btnminus);

        tvdislpay = (TextView) findViewById(R.id.tvdisplay);

        btnadd.setOnClickListener(this);

        btnmin.setOnClickListener(this);

    }


    @Override

    public void onClick(View v) {


        if (v == btnmin) {

            point--;

            tvdislpay.setText("count :  " + point);

        }

        if (v == btnadd) {

            point++;

            tvdislpay.setText("count : " + point);

        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
