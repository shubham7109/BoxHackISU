package com.example.kynarafernandes.encryptionapp;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class code2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code2);

        //declare boolean
        boolean clicked = false;
        final Context context = getApplicationContext();

        //final EditText txtname = (EditText)findViewById(R.id.value);

        final Button press = (Button) findViewById(R.id.b1);
        press.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               /* Toast x = Toast.makeText(context, "Don't mess up", Toast.LENGTH_SHORT);
                x.show();*/
                Intent intent = new Intent(code2.this, level2.class);
                startActivity(intent);

            }

        });


    }
}

