package com.example.kynarafernandes.encryptionapp;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        //declare boolean
        boolean clicked = false;
        final Context context = getApplicationContext();

        //final EditText txtname = (EditText)findViewById(R.id.value);

        final Button press = (Button) findViewById(R.id.b1);
        press.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast x = Toast.makeText(context, "I'd like to see you try.", Toast.LENGTH_SHORT);
                x.show();
                Intent intent = new Intent(Levels.this, level1.class);
                startActivity(intent);

            }

        });

        final Button p1 = (Button) findViewById(R.id.b2);
        p1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast x = Toast.makeText(context, "Shouldn't have that.", Toast.LENGTH_SHORT);
                x.show();
                Intent intent = new Intent(Levels.this, MainActivity.class);
                startActivity(intent);

            }

        });


    }
}