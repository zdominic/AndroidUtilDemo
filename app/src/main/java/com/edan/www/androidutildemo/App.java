package com.edan.www.androidutildemo;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/8/23 10:31
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
