package com.example.mohsallam.fragmentcommunication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment,new PlusOneFragment());
        transaction.add(R.id.fragment2,new BlankFragment());
        transaction.commit();

    }
}
