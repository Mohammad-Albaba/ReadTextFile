package com.mohammad.readtextfile;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textview);
//        InputStream input=null;
////        try {
////            input=getAssets().open("textfile.txt");
////            int size=input.available();
////            byte[] addtxt=new byte[size];
////            input.read(addtxt);
////            input.close();
////            String txt=new String(addtxt);
////            textView.setText(txt);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
        StringBuilder text = new StringBuilder();
        try {
            InputStream inputStream = null;
            inputStream = getAssets().open("textfile.txt");

            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(isr);
            try {
                String line;
                while ((line = br.readLine()) != null) {
                    text.append(line);
                    text.append('\n');
                }

        } catch (IOException e) {

        }
            } catch (Exception e) {
            e.printStackTrace();
            }
        textView.setText(text);

          }}

