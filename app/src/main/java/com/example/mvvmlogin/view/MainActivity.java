package com.example.mvvmlogin.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvvmlogin.R;
import com.example.mvvmlogin.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {
    private EditText inputEmail, inputPassword;
    private Button Login;
    private UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEmail = findViewById(R.id.email);
        inputPassword = findViewById(R.id.password);
        Login = findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("test",inputEmail.getText().toString());
                userViewModel.updateModel(inputEmail.getText().toString(), inputPassword.getText().toString());
                userViewModel.validLogin();
                //Toast.makeText(MainActivity.this, inputEmail.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
