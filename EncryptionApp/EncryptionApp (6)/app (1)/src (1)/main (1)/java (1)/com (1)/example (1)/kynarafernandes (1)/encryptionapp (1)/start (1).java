package com.example.kynarafernandes.encryptionapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //declare boolean
        boolean clicked = false;
        final Context context = getApplicationContext();

        final EditText txtname = (EditText)findViewById(R.id.value);
        level2 obj= new level2();

        final Button p1 = (Button) findViewById(R.id.b1);
        final Button p2 = (Button) findViewById(R.id.b2);
        p1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast x= Toast.makeText(context, "Good choice.", Toast.LENGTH_SHORT);
                x.show();
                Intent intent = new Intent(start.this,MainActivity.class);
                startActivity(intent);
            }

        });
        p2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast x= Toast.makeText(context, "If you say so.", Toast.LENGTH_SHORT);
                x.show();
                Intent intent = new Intent(start.this,Task1.class);
                startActivity(intent);

            }

        });
    }


}


