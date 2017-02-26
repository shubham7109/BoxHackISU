package com.example.kynarafernandes.encryptionapp;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Task1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        //declare boolean
        boolean clicked = false;
        final Context context = getApplicationContext();

        final Button press = (Button) findViewById(R.id.nexttask);
        press.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast x = Toast.makeText(context, "Have you completed this task?", Toast.LENGTH_SHORT);
                x.show();


                final Button p = (Button) findViewById(R.id.nexttask);
                p.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Task1.this,Task2.class);
                        startActivity(intent);
                    }
                });


            }
        });

    }
}
