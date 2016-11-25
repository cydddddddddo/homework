package com.example.homework.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    Button zhuche;
    Button denglu;
    TextView ID;
    TextView Password;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zhuche = (Button) findViewById(R.id.zhuche);
        denglu = (Button) findViewById(R.id.denglu);
        ID = (TextView) findViewById(R.id.ID);
        Password = (TextView) findViewById(R.id.Password);

        zhuche.setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick(View arg0){
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        denglu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Intent intent=new Intent(MainActivity.this,Main22Activity.class);
                startActivity(intent);
            }
        }
        );
    ;}
}