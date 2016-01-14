package com.example.atulkumar.messengerapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dd.processbutton.FlatButton;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FlatButton loginButton;
    FlatButton createAccountButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = ( FlatButton ) findViewById( R.id.loginButton );
        createAccountButton = ( FlatButton ) findViewById( R.id.createButton );

        loginButton.setOnClickListener( this );
        createAccountButton.setOnClickListener( this );

    }

    @Override
    public void onClick(View v) {

        switch( v.getId() ){
            case R.id.loginButton:
                break;
            case R.id.createButton:
                startActivity( new Intent( getApplicationContext(), CreateAccount.class ));
                break;
        }

    }
}
