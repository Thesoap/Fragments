package com.example.tvh.fragments;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.ArraySet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    public ListFragment listFragment;
    SharedPreferences SPList;
    SharedPreferences.Editor SPEditor;
    public int PersonId = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SPList = PreferenceManager.getDefaultSharedPreferences(this);
        ListFragment listFragment = new ListFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.List_Fragment, listFragment);
        fragmentTransaction.commit();
        listFragment = (ListFragment) fragmentManager.findFragmentById(R.id.List_Fragment);
        ArraySet<String> set = new ArraySet <String>();
        set.add("Hej");
        set.add("Kalkun");
        System.out.println(set.size());
        //SPEditor.putStringSet("Hej",set);
        SPList.edit().putStringSet("1",set).commit();
        //SPEditor.putStringSet("1",set);
        //SPEditor.apply();
        System.out.println(SPList.getStringSet("1",null));
    }
}
