package com.example.gcff.factory;

import com.example.gcff.mouse.DellMouse;
import com.example.gcff.mouse.Mouse;

/**
 * @author Administrator
 */
public class DellMouseFactory implements SimpleMouseFactroy {
    @Override
    public Mouse creatMouse() {
        return new DellMouse();
    }
}
