package com.example.yijianadd_removeall_activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yijianadd_removeall_activity.R;

import static com.example.yijianadd_removeall_activity.App.mActivitysList;

/**
 * 静态导包：MActivitysList设为public static
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        addActivity();

    }
    /**
     * 添加当前Activity
     */
    private void addActivity(){
        mActivitysList.add(this);
    }

    private void removeActivity(){
        mActivitysList.remove(this);
    }

    public void removeAll(){
        for (int i = 0; i < mActivitysList.size(); i++) {
            if (null != mActivitysList.get(i)) {
                mActivitysList.get(i).finish();
            }
        }
    }
}
