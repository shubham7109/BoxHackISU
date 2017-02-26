package com.example.kynarafernandes.encryptionapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class code5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code5);

        //declare boolean
        boolean clicked = false;
        final Context context = getApplicationContext();

        //final EditText txtname = (EditText)findViewById(R.id.value);

        final Button press = (Button) findViewById(R.id.b1);
        press.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast x = Toast.makeText(context, "How could you?", Toast.LENGTH_SHORT);
                x.show();
                Intent intent = new Intent(code5.this, end.class);
                startActivity(intent);

            }

        });
        final Button p1 = (Button) findViewById(R.id.b2);
        p1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast x = Toast.makeText(context, "Sucker", Toast.LENGTH_SHORT);
                x.show();
                Intent intent = new Intent(code5.this, MainActivity.class);
                startActivity(intent);
            }

        });


    }
}
