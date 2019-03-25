package com.example.cxgg;

import com.example.cxgg.factory.HpFactory;
import com.example.cxgg.factory.PcFactory;
import com.example.cxgg.keybord.Keybord;
import com.example.cxgg.mouse.Mouse;

public class Test {
    public static void main(String[] args) {
        PcFactory factory = new HpFactory();
        Keybord keybord = factory.creatKeybord();
        Mouse mouse = factory.creatMouse();
        keybord.sayHello();
        mouse.sayHi();
    }
}
