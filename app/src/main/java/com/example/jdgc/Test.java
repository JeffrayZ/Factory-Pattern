package com.example.jdgc;

import com.example.jdgc.mouse.Mouse;

public class Test {
    public static void main(String[] args) {
        Mouse mouse = SimpleMouseFactroy.creatMouse(0);
        mouse.sayHi();
    }
}
