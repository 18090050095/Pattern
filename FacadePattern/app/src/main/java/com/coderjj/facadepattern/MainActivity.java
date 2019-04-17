package com.coderjj.facadepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.coderjj.facadepattern.product.MobilePhone;

import static java.security.AccessController.getContext;

/**
 * 外观模式：★★★★★
 * 把一些复杂的流程封装成一个接口供给外部用户更简单的使用。
 * 他隐藏了系统的复杂性，并向客户端提供了一个可以访问系统的接口。这种类型的设计模式属于结构性模式。
 * 为子系统中的一组接口提供了一个统一的访问接口，这个接口使得子系统更容易被访问或者使用。
 */
public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Facade";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobilePhone honor = new MobilePhone();
        honor.takePicture();
        honor.videoChat();
    }
}
