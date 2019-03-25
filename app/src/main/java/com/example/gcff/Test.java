package com.example.gcff;


import com.example.gcff.factory.DellMouseFactory;
import com.example.gcff.factory.SimpleMouseFactroy;
import com.example.gcff.mouse.Mouse;

public class Test {
    public static void main(String[] args) {
        SimpleMouseFactroy factory = new DellMouseFactory();
        Mouse mouse = factory.creatMouse();
        mouse.sayHi();
    }
}
