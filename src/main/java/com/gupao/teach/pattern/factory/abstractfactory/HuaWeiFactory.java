package com.gupao.teach.pattern.factory.abstractfactory;

import com.gupao.teach.pattern.factory.abstractfactory.audio.Audio;
import com.gupao.teach.pattern.factory.abstractfactory.audio.HuaWeiAudio;
import com.gupao.teach.pattern.factory.abstractfactory.phone.HuaWeiPhone;
import com.gupao.teach.pattern.factory.abstractfactory.phone.Phone;
import com.gupao.teach.pattern.factory.abstractfactory.video.HuaWeiVideo;
import com.gupao.teach.pattern.factory.abstractfactory.video.Video;

public class HuaWeiFactory implements IAbstractFactory {
    public Phone getPhone() {
        return new HuaWeiPhone();
    }

    public Audio getAudio() {
        return new HuaWeiAudio();
    }

    public Video getVideo() {
        return new HuaWeiVideo();
    }
}
