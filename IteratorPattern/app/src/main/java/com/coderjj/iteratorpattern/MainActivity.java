package com.coderjj.iteratorpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.coderjj.iteratorpattern.iterator.Iterator;
import com.coderjj.iteratorpattern.softdepartment.SoftDepartment;
import com.coderjj.iteratorpattern.testdepartment.TestDepartment;

/**
 * 迭代器模式：
 *      行为型设计模式之一。源于对容器的访问
 *      如果我们将遍历算法封装到容器中，那么对于容器类来说就承担了过多的功能
 *      容器类不仅要维护自身内部的元素而且还要对外提供遍历的接口方法，因为遍历
 *      的存储问题还不能对同一个容器同时进行多个遍历操作，如果我们不提供遍历方法
 *      而让使用者自己去实现，又会让容器的内部细节暴露无遗，正因如此，迭代器模式
 *      应运而生，在客户访问类与容器之间插入了一个第三者--迭代器，很好的解决了上面
 *      所述的弊端。
 * 定义：
 *      提供一种方法顺序访问一个容器对象中的各个元素，而又不需要暴露该对象的内部表示。
 * 缺点：
 *      对于比较简单的遍历（像数组或者有序列表），使用迭代器方式遍历较为繁琐，大家可能
 *      都有感觉，像ArrayList，我们宁可愿意使用for循环和get方法来遍历集合
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SoftDepartment softDepartment = new SoftDepartment();
        check(softDepartment.iterator());

        TestDepartment testDepartment = new TestDepartment();
        check(testDepartment.iterator());
    }

    private void check(Iterator iterator) {
        while (iterator.hasNext()){
            Log.d(TAG, "check: "+iterator.next().toString());
        }
    }
}
