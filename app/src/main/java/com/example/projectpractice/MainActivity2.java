package com.example.projectpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
   ListView simpleList;
   String jewleryList[]={"Gold","Silver","Daimond","Platenium","Coper"};
   int pics[]={R.drawable.gold,R.drawable.silver,R.drawable.daimond,R.drawable.platenium,R.drawable.coper};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       simpleList = (ListView) findViewById(R.id.list_item);
       List list = new List(getApplicationContext(),jewleryList,pics);
       simpleList.setAdapter(list);


    }
}