package com.coderjj.iteratorpattern.iterator;

import com.coderjj.iteratorpattern.entity.Employee;

/**
 * Created by Administrator on 2019/4/16.
 */

public class TestIterator implements Iterator {
    private Employee[] arry;
    private int position = 0;

    public TestIterator(Employee[] arry) {
        this.arry = arry;
    }

    @Override
    public boolean hasNext() {
        if (position < arry.length) {
            if (arry[position] == null) {
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
        Employee e = arry[position];
        position++;
        return e;
    }
}
