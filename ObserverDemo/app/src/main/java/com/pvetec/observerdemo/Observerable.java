package com.pvetec.observerdemo;

/**
 * Created by Jack on 2018/12/7.
 *数据源抽象类
 */

public interface Observerable {

    void registerObserver(Observer observer);
    void removeObserver();
    void notifyObserver();
}
