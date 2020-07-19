package com.example.kirana;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import org.w3c.dom.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        OnScreenLoad();
    }

    public void OnScreenLoad(){
        Button signIn = findViewById(R.id.btnJoin);
        signIn.setOnClickListener(OnSignInClick);

    }

    private boolean IsOnlyNumber(String string) {
        try {
            String strpattern = "^[0-9]$";
            Pattern pattern = Pattern.compile(strpattern);
            Matcher matcher = pattern.matcher(string);

            if (!matcher.matches())
                return false;
            else
                return true;
        } catch (Exception ex) {
        }
        return false;
    }


    public View.OnClickListener OnSignInClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            OnSignIn();

        }
    };

    private void OnSignIn(){
    }
}
