package com.coderjj.facadepattern.phone;

import android.util.Log;

import static com.coderjj.facadepattern.MainActivity.TAG;

/**
 * Created by Administrator on 2019/4/16.
 */

public class PhoneImpl implements Phone {

    @Override
    public void dail() {
        Log.d(TAG, "PhoneImpl dail: ");
    }

    @Override
    public void hangUp() {
        Log.d(TAG, "PhoneImpl hangUp: ");
    }
}
