package com.example.projectpractice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerview extends AppCompatActivity {
    RecyclerView rev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.recycler_view);
       rev=(RecyclerView)findViewById(R.id.rciview);
       rev.setLayoutManager(new LinearLayoutManager(this));
       String arr[]={"Gold","Silver","Daimond","Platenium"};
        rev.setAdapter(new myAdapter(arr));


    }


}
