package com.example.torab.splashscreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;

import java.io.*;
import java.net.*;
import java.lang.Object;
   import     java.net.Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import static android.content.DialogInterface.*;

/**
 * Created by petre on 11/4/2017.
 */

public class products  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.products);



        Button button6 = (Button) findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {


                AlertDialog alertDialog;
                alertDialog = new AlertDialog.Builder(products.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("Alert message to be shown");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
                try {
                    UDP1 ();
                    UDP2 ();
                } catch (IOException e) {
                    e.printStackTrace ( );
                }

            }
            public void UDP1() throws IOException {
                String messageStr="cola";
                int server_port = 9998;
                DatagramSocket s = new DatagramSocket();
                InetAddress local = InetAddress.getByName("192.168.43.16");
                int msg_length=messageStr.length();
                byte[] message = messageStr.getBytes();
                DatagramPacket p = new DatagramPacket(message, msg_length,local,server_port);
                s.send(p);
            }
            public void UDP2() throws IOException {
                String messageStr="cola";
                int server_port = 9997;
                DatagramSocket s = new DatagramSocket();
                InetAddress local = InetAddress.getByName("192.168.43.16");
                int msg_length=messageStr.length();
                byte[] message = messageStr.getBytes();
                DatagramPacket p = new DatagramPacket(message, msg_length,local,server_port);
                s.send(p);
            }


            });
        }

    }


