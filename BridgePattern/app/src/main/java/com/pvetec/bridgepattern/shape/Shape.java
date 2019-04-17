package com.pvetec.bridgepattern.shape;

import com.pvetec.bridgepattern.color.Color;

/**
 * Created by Administrator on 2018/12/10.
 */

public abstract class Shape {

    Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void draw();
}
