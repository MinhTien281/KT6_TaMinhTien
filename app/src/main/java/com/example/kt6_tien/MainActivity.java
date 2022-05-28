package com.example.kt6_tien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kt6_tien.CustomListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<com.example.kt6_tien.Country> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                com.example.kt6_tien.Country country = (com.example.kt6_tien.Country) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<com.example.kt6_tien.Country> getListData() {
        List<com.example.kt6_tien.Country> list = new ArrayList<com.example.kt6_tien.Country>();
        com.example.kt6_tien.Country vietnam = new com.example.kt6_tien.Country("Vietnam", "vn", 98000000);
        com.example.kt6_tien.Country usa = new com.example.kt6_tien.Country("United States", "us", 320000000);
        com.example.kt6_tien.Country russia = new com.example.kt6_tien.Country("Russia", "ru", 142000000);
        com.example.kt6_tien.Country korea = new com.example.kt6_tien.Country("Korea", "kr", 152000000);
        com.example.kt6_tien.Country japan = new com.example.kt6_tien.Country("Japan", "jp", 182000000);
        com.example.kt6_tien.Country cuba = new com.example.kt6_tien.Country("Cuba", "cuba", 282000000);



        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(korea);
        list.add(japan);
        list.add(cuba);

        return list;
    }

}