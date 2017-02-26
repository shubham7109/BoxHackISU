package com.example.kynarafernandes.encryptionapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Task2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        //declare boolean
        boolean clicked = false;
        final Context context = getApplicationContext();

        final EditText txtname = (EditText)findViewById(R.id.value);


        final Button press = (Button) findViewById(R.id.b1);
        press.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                String name      =  txtname.getText().toString();
                if (name.equals("87"))
                {
                    Toast x= Toast.makeText(context, "Good guess.", Toast.LENGTH_SHORT);
                    x.show();
                    Intent intent = new Intent(Task2.this,code1.class);
                    startActivity(intent);

                }
                else
                {
                    Toast x = Toast.makeText(context, "You failure",Toast.LENGTH_SHORT);
                    x.show();
                }

            }

        });

    }



}
