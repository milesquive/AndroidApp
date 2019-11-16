package com.e.casapatrao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author hilarioquive@gmail.com
 */
public class Login extends AppCompatActivity {

    private Intent _createPIntent;
    private Button _btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");
        _createPIntent = new Intent(this, CreateProduct.class);
        _btnLogin = findViewById(R.id.btnLogin);

        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(_createPIntent);
            }
        });

    }
}
