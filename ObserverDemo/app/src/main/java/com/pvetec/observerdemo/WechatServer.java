package com.pvetec.observerdemo;

import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Jack on 2018/12/7.
 *数据源实现类：数据发生改变的地方
 *主要功能：注册观察者，移除观察者，通知观察者更新数据
 */

public class WechatServer implements Observerable{

    private List<Observer> mList;
    private String message;

    public WechatServer(){
        mList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        mList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        Log.d("WechatServer1", "removeObserver: "+mList.toArray().toString());
        if (mList != null){
            Iterator<Observer> iterators = mList.iterator();
            if (iterators != null){
                while (iterators.hasNext()){
                    Observer o = iterators.next();
                    if (observer != null && observer == o){
                        iterators.remove();
                    }
                }
            }
        }
        Log.d("WechatServer2", "removeObserver: "+mList.toArray().toString());
    }

    @Override
    public void removeAllObserver() {
        if (mList != null) {
            mList.clear();
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer :
                mList) {
            observer.update(message);
        }
    }

    public void setInfomation (String message){
        this.message = message;
        notifyObserver();
    }
}
