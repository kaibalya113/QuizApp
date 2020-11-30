package com.kaibalya.quizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
//
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Categories"); // dipaly in bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // back button will show

        recyclerView = findViewById(R.id.rcylrVw);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        // set adapter
        List<Category> model = new ArrayList<>();
        model.add(new Category("", "1"));
        model.add(new Category("", "2"));
        model.add(new Category("", "3"));
        model.add(new Category("", "4"));
        model.add(new Category("", "5"));
        model.add(new Category("", "6"));
        model.add(new Category("", "7"));
        model.add(new Category("", "8"));
        model.add(new Category("", "9"));
        model.add(new Category("", "0"));
        model.add(new Category("", "10"));
        CategoryAdapter categoryAdapter = new CategoryAdapter(model);
        recyclerView.setAdapter(categoryAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}