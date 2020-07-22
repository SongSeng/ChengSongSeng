package com.rupp.fe.chengsongseng;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Product> listProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        
    }

    private void loadRecyclerViewData(){
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();


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