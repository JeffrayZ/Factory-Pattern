package com.example.jdgc;

import com.example.jdgc.mouse.DellMouse;
import com.example.jdgc.mouse.HpMouse;
import com.example.jdgc.mouse.Mouse;

public class SimpleMouseFactroy {
    public static Mouse creatMouse(int i) {
        Mouse mouse = null;
        switch (i) {
            case 0:
                mouse = new DellMouse();
                break;
            case 1:
                mouse = new HpMouse();
                break;
            default:
                break;
        }
        return mouse;
    }
}
