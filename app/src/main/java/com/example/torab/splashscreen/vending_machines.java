package com.example.torab.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by petre on 11/4/2017.
 */


public class vending_machines extends AppCompatActivity {
    private static final String TAG = "vending_machines";



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vending_machines);


        Log.d(TAG, "onCreate: Starting");


        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked button8");
                Intent intent = new Intent(vending_machines.this,products.class);
                startActivity(intent);

            }

        });
    }
}
