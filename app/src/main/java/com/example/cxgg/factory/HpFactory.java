package com.example.cxgg.factory;

import com.example.cxgg.keybord.HpKeybord;
import com.example.cxgg.keybord.Keybord;
import com.example.cxgg.mouse.HpMouse;
import com.example.cxgg.mouse.Mouse;

public class HpFactory implements PcFactory {
    @Override
    public Mouse creatMouse() {
        return new HpMouse();
    }

    @Override
    public Keybord creatKeybord() {
        return new HpKeybord();
    }
}
