package com.example.tvh.fragments;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArraySet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {
    public int id;
    public SharedPreferences SP;
    public String cur;
    public String[] holder;
    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_liste, container, false);
        SharedPreferences SP = this.getActivity().getSharedPreferences("pref", Context.MODE_PRIVATE);
        ArraySet<String> set = new ArraySet <String>();
        String[] holder = new String[20];
        holder[0] = "Hek";
        ListView list = (ListView) view.findViewById(R.id.listView);
        ArrayAdapter<String> arrayStringAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,holder);
        list.setAdapter(arrayStringAdapter);
        Log.d("ListFragment","Fragmentloaded");
        Log.d("Array",holder[0]);
        return view;
    }

    public void changeList(){

    }

}
