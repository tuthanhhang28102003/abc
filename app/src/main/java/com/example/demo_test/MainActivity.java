package com.example.demo_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.demo_test.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ListView lvmonhoc;
    ArrayList <String> mangmonhoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        lvmonhoc=findViewById(R.id.lvmonhoc);
        mangmonhoc = new ArrayList<>();


        mangmonhoc.add("Android");
        mangmonhoc.add("web");
        mangmonhoc.add("E-marketing");
        mangmonhoc.add("BI");

        ArrayAdapter arrayAdapter = new ArrayAdapter(
                MainActivity.this, android.R.layout.simple_list_item_1, mangmonhoc
        );
        lvmonhoc.setAdapter(arrayAdapter);

        lvmonhoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "position", Toast.LENGTH_SHORT).show();
            }
        });
        private void ViewDetail (){
            //ViewDetail
        };
    }
}