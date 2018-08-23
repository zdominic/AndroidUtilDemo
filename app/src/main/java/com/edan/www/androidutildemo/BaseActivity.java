package com.edan.www.androidutildemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ScreenUtils;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/8/23 11:41
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (ScreenUtils.isPortrait()) {
            ScreenUtils.adaptScreen4VerticalSlide(this, 1080);
        } else {
            ScreenUtils.adaptScreen4HorizontalSlide(this, 1920);
        }
        setContentView(getLayout());
        init();
    }

    abstract public int getLayout();

    abstract public void init();
}
