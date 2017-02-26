package com.example.kynarafernandes.encryptionapp;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        //declare boolean
        boolean clicked = false;
        final Context context = getApplicationContext();

        final EditText txtname = (EditText)findViewById(R.id.value);
        level2 obj= new level2();

        final Button press = (Button) findViewById(R.id.checkValueButton);
        press.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                String name      =  txtname.getText().toString();
                if (name.equals("Either you look like a programmer or I cant C sharp"))
                {
                    Toast x= Toast.makeText(context, "Good guess.", Toast.LENGTH_SHORT);
                    x.show();
                    Intent intent = new Intent(level1.this,code2.class);
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


