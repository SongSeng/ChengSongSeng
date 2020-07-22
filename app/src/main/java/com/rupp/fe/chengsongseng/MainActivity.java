package com.rupp.fe.chengsongseng;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View view){
        Fragment fragment;
        if ( view == findViewById(R.id.button)){
            fragment = new HomeFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragLayout, fragment);
            ft.commit();
        }
        if ( view == findViewById(R.id.button2)){
            fragment = new CategoriesFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragLayout, fragment);
            ft.commit();
        }
        if ( view == findViewById(R.id.button3)){
            fragment = new SearchFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragLayout, fragment);
            ft.commit();
        }
        if ( view == findViewById(R.id.button4)){
            fragment = new AccountFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragLayout, fragment);
            ft.commit();
        }
    }
}