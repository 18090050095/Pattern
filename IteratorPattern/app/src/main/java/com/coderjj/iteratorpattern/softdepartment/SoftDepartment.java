package com.coderjj.iteratorpattern.softdepartment;

import com.coderjj.iteratorpattern.entity.Employee;
import com.coderjj.iteratorpattern.iterator.Department;
import com.coderjj.iteratorpattern.iterator.Iterator;
import com.coderjj.iteratorpattern.iterator.SoftIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/4/15.
 */

public class SoftDepartment implements Department{
    private List<Employee> lists = new ArrayList<>();

    public SoftDepartment() {
        lists.add(new Employee("刘杰",24,"程序猿"));
        lists.add(new Employee("张仁华",29,"工程师"));
        lists.add(new Employee("龙泰俊",30,"攻城狮"));
    }

    public List<Employee> getLists() {
        return lists;
    }

    @Override
    public Iterator iterator() {
        return new SoftIterator(lists);
    }
}
