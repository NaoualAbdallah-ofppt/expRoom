package com.example.exproom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListActivity extends AppCompatActivity {
    RecyclerView RV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        RV=(RecyclerView) findViewById(R.id.RV);
        CustomAdapter CA = new CustomAdapter(this);
     //   LinearLayoutManager LLM = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
         LinearLayoutManager LLM = new LinearLayoutManager(this);
        //si scrol vertical
        RV.setLayoutManager(LLM);
        RV.setAdapter(CA);


    }
}