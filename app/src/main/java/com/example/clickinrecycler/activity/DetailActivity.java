package com.example.clickinrecycler.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.clickinrecycler.R;

public class DetailActivity extends AppCompatActivity {

    TextView contactName;
    TextView contactNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initViews();
    }

    void initViews() {
        contactName = findViewById(R.id.tv_name);

        contactName.setText(getIntent().getSerializableExtra("contact").toString());
    }
}