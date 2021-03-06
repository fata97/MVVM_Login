package com.example.mvvmlogin.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.example.mvvmlogin.model.User;

public class UserViewModel {
    public final static String TOAST_MESSAGE_SUCCESS = "Login Success";
    public final static String TOAST_MESSAGE_FAILED = "Login Failed";
    private User user;
    private Context context;

    public UserViewModel(Context context, User user){
        this.user = user;
        this.context = context;
    }

    public void updateModel(String email, String password){
        user.setEmail(email);
        user.setPassword(password);

        //Log.d("hiks1",user.getEmail());
        //Log.d("hiks2",user.email);
        Log.d("hiks3",email);
        //Toast.makeText(context, user.getEmail(), Toast.LENGTH_SHORT).show();
    }

    public void validLogin(){
        boolean isValid = true;

        if (TextUtils.isEmpty(user.getEmail()))
            isValid = false;

        if (TextUtils.isEmpty(user.getPassword()))
            isValid = false;

        if (isValid)
            showToast(TOAST_MESSAGE_SUCCESS);
        else
            showToast(TOAST_MESSAGE_FAILED);
    }

    private void showToast(String messageToast){
        Toast.makeText(context, messageToast, Toast.LENGTH_SHORT).show();
    }

}
