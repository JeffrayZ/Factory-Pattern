package com.example.cxgg.factory;

import com.example.cxgg.keybord.Keybord;
import com.example.cxgg.mouse.Mouse;

public interface PcFactory {
    Mouse creatMouse();
    Keybord creatKeybord();
}
