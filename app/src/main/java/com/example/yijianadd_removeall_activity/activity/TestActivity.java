package com.example.yijianadd_removeall_activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.yijianadd_removeall_activity.R;

public class TestActivity extends BaseUiActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLeftImage().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeAll();
            }
        });
    }

    @Override
    public int getMyContentView() {
        return R.layout.activity_test;
    }
}
