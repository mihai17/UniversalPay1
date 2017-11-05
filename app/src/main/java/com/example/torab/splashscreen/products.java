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

public class products  extends AppCompatActivity  {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate (savedInstanceState);
        setContentView (R.layout.products);
        defineButtons ( );
    }

    private void defineButtons() {
        findViewById (R.id.button6).setOnClickListener (buttonClickListener);
        findViewById (R.id.button11).setOnClickListener (buttonClickListener);
        findViewById (R.id.button10).setOnClickListener (buttonClickListener);
        findViewById (R.id.button9).setOnClickListener (buttonClickListener);
    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener (){
        @Override
        public void onClick (View view){
            switch (view.getId()){
                case R.id.button6:
                    try {
                        AlertDialog alertDialog;
                        alertDialog = new AlertDialog.Builder(products.this).create();
                        alertDialog.setTitle("Congratulations!");
                        alertDialog.setMessage("Transaction Successful");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                        UDP1 ();
                        UDP2 ();
                    } catch (IOException e) {
                        e.printStackTrace ( );
                    }
                    break;
                case R.id.button11:
                    try {AlertDialog alertDialog;
                        alertDialog = new AlertDialog.Builder(products.this).create();
                        alertDialog.setTitle("Congratulations!");
                        alertDialog.setMessage("Transaction Successful");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                        UDP3 ();
                        UDP4 ();
                    } catch (IOException e) {
                        e.printStackTrace ( );
                    }
                    break;
                case R.id.button10:
                    try {
                        AlertDialog alertDialog;
                        alertDialog = new AlertDialog.Builder(products.this).create();
                        alertDialog.setTitle("Congratulations!");
                        alertDialog.setMessage("Transaction Successful");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                        UDP5 ();
                        UDP6();
                    } catch (IOException e) {
                        e.printStackTrace ( );
                    }
                    break;

                case R.id.button9:
                     {
                        AlertDialog alertDialog;
                        alertDialog = new AlertDialog.Builder(products.this).create();
                        alertDialog.setTitle("Uh-Oh!");
                        alertDialog.setMessage("Sorry!No products were found in this category!");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok :(",
                                new OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();

                    }
                    break;


            }}
        public void UDP1() throws IOException {
            String messageStr="cola";
            int server_port = 9998;
            DatagramSocket s = new DatagramSocket();
            InetAddress local = InetAddress.getByName("192.168.1.230");
            int msg_length=messageStr.length();
            byte[] message = messageStr.getBytes();
            DatagramPacket p = new DatagramPacket(message, msg_length,local,server_port);
            s.send(p);
        }
        public void UDP2() throws IOException {
            String messageStr="cola";
            int server_port = 9997;
            DatagramSocket s = new DatagramSocket();
            InetAddress local = InetAddress.getByName("192.168.1.230");
            int msg_length=messageStr.length();
            byte[] message = messageStr.getBytes();
            DatagramPacket p = new DatagramPacket(message, msg_length,local,server_port);
            s.send(p);
        }

        public void UDP3() throws IOException {
            String messageStr="pepsi";
            int server_port = 9998;
            DatagramSocket s = new DatagramSocket();
            InetAddress local = InetAddress.getByName("192.168.1.230");
            int msg_length=messageStr.length();
            byte[] message = messageStr.getBytes();
            DatagramPacket p = new DatagramPacket(message, msg_length,local,server_port);
            s.send(p);
        }
        public void UDP4() throws IOException {
            String messageStr="pepsi";
            int server_port = 9997;
            DatagramSocket s = new DatagramSocket();
            InetAddress local = InetAddress.getByName("192.168.1.230");
            int msg_length=messageStr.length();
            byte[] message = messageStr.getBytes();
            DatagramPacket p = new DatagramPacket(message, msg_length,local,server_port);
            s.send(p);
        }
        public void UDP5() throws IOException {
            String messageStr="redbull";
            int server_port = 9998;
            DatagramSocket s = new DatagramSocket();
            InetAddress local = InetAddress.getByName("192.168.1.230");
            int msg_length=messageStr.length();
            byte[] message = messageStr.getBytes();
            DatagramPacket p = new DatagramPacket(message, msg_length,local,server_port);
            s.send(p);
        }
        public void UDP6() throws IOException {
            String messageStr="redbull";
            int server_port = 9997;
            DatagramSocket s = new DatagramSocket();
            InetAddress local = InetAddress.getByName("192.168.1.230");
            int msg_length=messageStr.length();
            byte[] message = messageStr.getBytes();
            DatagramPacket p = new DatagramPacket(message, msg_length,local,server_port);
            s.send(p);
        }



    };}





