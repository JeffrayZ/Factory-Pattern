package com.example.cxgg.factory;

import com.example.cxgg.keybord.DellKeybord;
import com.example.cxgg.keybord.Keybord;
import com.example.cxgg.mouse.DellMouse;
import com.example.cxgg.mouse.Mouse;

public class DellFactory implements PcFactory {
    @Override
    public Mouse creatMouse() {
        return new DellMouse();
    }

    @Override
    public Keybord creatKeybord() {
        return new DellKeybord();
    }
}
