package com.coderjj.iteratorpattern.testdepartment;

import com.coderjj.iteratorpattern.entity.Employee;
import com.coderjj.iteratorpattern.iterator.Department;
import com.coderjj.iteratorpattern.iterator.Iterator;
import com.coderjj.iteratorpattern.iterator.TestIterator;

/**
 * Created by Administrator on 2019/4/15.
 */

public class TestDepartment implements Department{
    private Employee [] array = new Employee[4];

    public TestDepartment() {
        array[0] = new Employee("小皮",18,"测试");
        array[1] = new Employee("小俊",19,"压力测试");
        array[2] = null;
        array[3] = new Employee("小候",24,"性能测试");
    }

    public Employee[] getArray() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new TestIterator(array);
    }
}
