package com.medium.customlistview.activities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import com.medium.customlistview.R;
import com.medium.customlistview.activities.adapters.FlowerAdapter;
import com.medium.customlistview.activities.models.Flower;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myList = (ListView) findViewById(R.id.listView);

        ArrayList<Flower> flowers = new ArrayList<>();
        Flower orchid = new Flower("Orchid",  "Phalaenopsis", R.drawable.orchid);
        Flower daisy = new Flower("Daisy", "Argyranthemum", R.drawable.daisy);
        Flower begonia = new Flower("Begonia","Begoniaceae", R.drawable.begonia);

        flowers.add(orchid);
        flowers.add(daisy);
        flowers.add(begonia);

        FlowerAdapter flowerAdapter = new FlowerAdapter(this,flowers);
        myList.setAdapter(flowerAdapter);
    }
}
