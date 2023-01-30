package com.shallowcode.androidarchitectures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.shallowcode.androidarchitectures.mvc.MVCActivity;
import com.shallowcode.androidarchitectures.mvp.MVPActivity;
import com.shallowcode.androidarchitectures.mvvm.MVVMActivity;

public class ArchitectureActivity extends AppCompatActivity {

    Button button_mvc, button_mvp, button_mvvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture);

        // initializing views
        button_mvc = findViewById(R.id.button_mvc);
        button_mvp = findViewById(R.id.button_mvp);
        button_mvvm = findViewById(R.id.button_mvvm);

        // setting on click listeners
        button_mvc.setOnClickListener(v -> {
            // start MVC activity
            startActivity(MVCActivity.getIntent(this));
        });

        button_mvp.setOnClickListener(v -> {
            // start MVP activity
            startActivity(MVPActivity.getIntent(this));
        });

        button_mvvm.setOnClickListener(v -> {
            // start MVVM activity
            startActivity(MVVMActivity.getIntent(this));
        });

    }
}