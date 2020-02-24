package com.gupao.teach.pattern.factory.abstractfactory.video;

public class HuaWeiVideo implements Video {
    public void getScreen() {
        System.out.println("华为手机 屏幕isp");
    }

    public void getInput() {
        System.out.println("华为手机 输入 hdmi");

    }
}
