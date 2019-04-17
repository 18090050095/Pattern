package com.pvetec.observerdemo;

import java.util.ArrayList;

/**
 * Created by Jack on 2018/12/7.
 *数据源实现类：数据发生改变的地方
 *主要功能：注册观察者，移除观察者，通知观察者更新数据
 */

public class WechatServer implements Observerable{

    private ArrayList<Observer> list;
    private String message;

    public WechatServer(){
        list = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver() {
            list.clear();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer :
                list) {
            observer.update(message);
        }
    }

    public void setInfomation (String message){
        this.message = message;
        notifyObserver();
    }
}
