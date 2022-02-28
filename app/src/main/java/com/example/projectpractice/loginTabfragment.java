package com.example.projectpractice;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class loginTabfragment extends Fragment {
    EditText email, passwoard, forgotpass;
    Button login;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);
        email = root.findViewById(R.id.Email);
        passwoard = root.findViewById(R.id.Password);
        forgotpass = root.findViewById(R.id.forgot);
        login = root.findViewById(R.id.login);

        email.setTranslationY(300);
        passwoard.setTranslationY(300);
        forgotpass.setTranslationY(300);
        login.setTranslationY(300);

        email.setAlpha(v);
        passwoard.setAlpha(v);
        forgotpass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        passwoard.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        forgotpass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        login.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();

        return root;
    }


}


