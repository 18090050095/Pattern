package com.coderjj.facadepattern.camera;

import android.util.Log;

import static com.coderjj.facadepattern.MainActivity.TAG;

/**
 * Created by Administrator on 2019/4/16.
 */

public class SamsungCamera implements Camera {
    @Override
    public void open() {
        Log.d(TAG, "SamsungCamera open: ");
    }

    @Override
    public void takePicture() {
        Log.d(TAG, "SamsungCamera takePicture: ");
    }

    @Override
    public void close() {
        Log.d(TAG, "SamsungCamera close: ");
    }
}
