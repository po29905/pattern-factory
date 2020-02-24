package com.gupao.teach.pattern.factory.abstractfactory.video;

import com.gupao.teach.pattern.factory.abstractfactory.phone.Phone;

public class XiaoMiVideo implements Video {
    public void getScreen() {
        System.out.println("小米手机 屏幕LDC");
    }

    public void getInput() {
        System.out.println("小米手机 输入 VGA");

    }
}
