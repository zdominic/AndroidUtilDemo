package com.edan.www.androidutildemo;

import android.util.Log;

import com.blankj.utilcode.util.ScreenUtils;

public class SecondActivity extends BaseActivity {

    @Override
    public int getLayout() {
        return R.layout.activity_second;
    }

    @Override
    public void init() {
        Log.e("aaa", "isAdaptScreen "+ ScreenUtils.isAdaptScreen());
    }
}
