package com.example.yijianadd_removeall_activity.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.yijianadd_removeall_activity.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class BaseUiActivity extends BaseActivity {

    @BindView(R.id.mLeftImage)
    ImageView mLeftImage;
    @BindView(R.id.mTitle)
    TextView mTitle;
    @BindView(R.id.mRightImage)
    ImageView mRightImage;
    @BindView(R.id.mTitleLayout)
    RelativeLayout mTitleLayout;
    @BindView(R.id.mCotnent)
    FrameLayout mCotnent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        setMyContentView(getMyContentView());//注意在ButterKnife下边
    }

    public abstract int getMyContentView();
    private void setMyContentView(int id){
        if (id == 0) {
            throw new NullPointerException("You must retrun Layout ID,return ID in getMyContentView method");
        }
        View view = LayoutInflater.from(this).inflate(id, null);
        mCotnent.addView(view);//标题栏下的布局View

    }

    public ImageView getLeftImage(){
        return mLeftImage;
    }

    public ImageView getmRightImage() {
        return mRightImage;
    }

    public void setmTitle(String title){
        mTitle.setText(title);
    }
}
