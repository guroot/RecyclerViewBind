package com.example.fletch.recyclerviewBind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "com.example.fletch.RecyclerViewTest.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.recyclerView);

        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(new RvAdapter());
    }
}
