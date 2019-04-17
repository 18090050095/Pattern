package com.pvetec.bridgepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pvetec.bridgepattern.color.Color;
import com.pvetec.bridgepattern.color.White;
import com.pvetec.bridgepattern.shape.Shape;
import com.pvetec.bridgepattern.shape.Square;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Color white = new White();
        Shape square = new Square();
        square.setColor(white);
        square.draw();
    }
}
