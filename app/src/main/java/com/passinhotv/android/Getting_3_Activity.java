package com.passinhotv.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.originqiu.library.EditTag;

public class Getting_3_Activity extends AppCompatActivity {
    Button btn_continue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_getting_3_);
        initView();
    }
    public void initView(){
        btn_continue = findViewById(R.id.btn_continue);
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Getting_3_Activity.this, Getting_4_Activity.class);
                startActivity(intent);
            }
        });
    }
}