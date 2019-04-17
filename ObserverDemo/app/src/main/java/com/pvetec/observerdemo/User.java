package com.pvetec.observerdemo;

import android.util.Log;

/**
 * Created by Jack on 2018/12/7.
 * 观察者实现类：需要响应变化的数据
 */

public class User implements Observer {

    public static final String TAG = "User";

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        Log.d(TAG, name+" update: "+message);
    }
}
