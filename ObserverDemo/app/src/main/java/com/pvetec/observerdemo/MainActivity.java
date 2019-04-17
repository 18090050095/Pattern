package com.pvetec.observerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private WechatServer mObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Observer liujie = new User("liujie");
        Observer daiyongrao = new User("daiyongrao");
        Observer zhaodan = new User("zhaodan");

        mObserver = new WechatServer();
        mObserver.registerObserver(liujie);
        mObserver.registerObserver(daiyongrao);
        mObserver.registerObserver(zhaodan);
        mObserver.setInfomation("lalaallalalalallalalal");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mObserver.removeObserver();
    }
}
