package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username,password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin =findViewById(R.id.button);



    }
    public void MyWeb(View view){
        if (TextUtils.isEmpty(username.getText().toString()) ||
                TextUtils.isEmpty(password.getText().toString())) {
            Toast.makeText(MainActivity.this, "EMPTY DATA PROVIDED", Toast.LENGTH_LONG).show();
        }
        else {
            openUrl("http://www.xyz.com");
        }
    }
    public void openUrl(String url){
        Uri uri = Uri.parse(url);
        Intent launchweb = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchweb);
    }


}