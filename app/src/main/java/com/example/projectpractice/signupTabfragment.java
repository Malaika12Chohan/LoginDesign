package com.example.projectpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class signupTabfragment extends Fragment {
    EditText email, username,passwoard, cnfrmpass;
    Button signup;
    float v = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        ViewGroup root =(ViewGroup) inflater.inflate(R.layout.signup_tab_fragment,container,false);
        email = root.findViewById(R.id.Email);
        username = root.findViewById(R.id.Username);
        passwoard = root.findViewById(R.id.Password);
        cnfrmpass = root.findViewById(R.id.CnfrmPassword);
        signup = root.findViewById(R.id.signup);

        email.setTranslationY(300);
        username.setTranslationY(300);
        passwoard.setTranslationY(300);
        cnfrmpass.setTranslationY(300);
        signup.setTranslationY(300);

        email.setAlpha(v);
        username.setAlpha(v);
        passwoard.setAlpha(v);
        cnfrmpass.setAlpha(v);
        signup.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        username.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        passwoard.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        cnfrmpass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1000).start();
        signup.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1020).start();

        return root;
    }

}
