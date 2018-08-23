package com.edan.www.androidutildemo;

import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.View;

import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ToastUtils;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        findViewById(R.id.buttonPanel).setOnClickListener(this);
        Log.e("aaa", "isAdaptScreen "+ ScreenUtils.isAdaptScreen());
        ToastUtils.showLong("MainActivity");
        ToastUtils.setBgColor(Color.RED);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this,SecondActivity.class));
    }

}
