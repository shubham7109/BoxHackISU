package com.example.kynarafernandes.encryptionapp;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare boolean
        boolean clicked = false;
        final Context context = getApplicationContext();

        //final EditText txtname = (EditText)findViewById(R.id.value);

        final Button press = (Button) findViewById(R.id.checkValueButton);
        press.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    Toast x= Toast.makeText(context, "Bold move", Toast.LENGTH_SHORT);
                    x.show();
                    Intent intent = new Intent(MainActivity.this,start.class);
                    startActivity(intent);

            }

        });

        final Button p = (Button) findViewById(R.id.devel);
        p.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Developers.class);
                startActivity(intent);

            }

        });

    }


}


