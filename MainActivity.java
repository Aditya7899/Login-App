package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText ed1,ed2;
    String uname="Aditya";
    String word="avadaKedavra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button1);
        ed1 = (EditText)findViewById(R.id.username_text);
        ed2 = (EditText)findViewById(R.id.password_text);
        b3=(Button)findViewById(R.id.fpassword);
        b2 = (Button)findViewById(R.id.button2);
        b4=(Button)findViewById(R.id.submit);
        b1.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (ed2.getText().toString().equals(word)) {
                                          Intent intent = new Intent(MainActivity.this, welcome.class);
                                          startActivity(intent);
                                      } else {
                                          Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
                                      }
                                  }
                              });
                b3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,enterEmail.class);
                        startActivity(intent);
                    }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,signUp.class);
                startActivity(intent);
            }
        });

            }
        }