package com.pvetec.bridgepattern.color;

import android.util.Log;

/**
 * Created by Administrator on 2018/12/10.
 */

public class Gray implements Color {

    private static final String TAG = "Color";

    @Override
    public void bepaint(String shape) {
        Log.d(TAG, "bepaint: "+"灰色的"+shape);
    }
}
