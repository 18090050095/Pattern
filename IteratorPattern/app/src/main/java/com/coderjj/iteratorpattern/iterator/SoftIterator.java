package com.coderjj.iteratorpattern.iterator;

import android.util.Log;

import com.coderjj.iteratorpattern.entity.Employee;

import java.util.List;

/**
 * Created by Administrator on 2019/4/16.
 */

public class SoftIterator implements Iterator {
    private List<Employee> list;
    private int position = 0;

    public static final String TAG = "SoftIterator";

    public SoftIterator(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        Log.d(TAG, "hasNext: " + position);
        if (position < list.size()) {
            if (list.get(position) == null) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Log.d(TAG, "next: " + position);
        Employee e = list.get(position);
        position++;
        return e;
    }
}
