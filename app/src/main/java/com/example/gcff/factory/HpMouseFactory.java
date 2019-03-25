package com.example.gcff.factory;

import com.example.gcff.mouse.HpMouse;
import com.example.gcff.mouse.Mouse;

/**
 * @author Administrator
 */
public class HpMouseFactory implements SimpleMouseFactroy {
    @Override
    public Mouse creatMouse() {
        return new HpMouse();
    }
}
