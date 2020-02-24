package com.gupao.teach.pattern.factory.abstractfactory;

import com.gupao.teach.pattern.factory.abstractfactory.audio.AppleAudio;
import com.gupao.teach.pattern.factory.abstractfactory.audio.Audio;
import com.gupao.teach.pattern.factory.abstractfactory.audio.HuaWeiAudio;
import com.gupao.teach.pattern.factory.abstractfactory.phone.ApplePhone;
import com.gupao.teach.pattern.factory.abstractfactory.phone.HuaWeiPhone;
import com.gupao.teach.pattern.factory.abstractfactory.phone.Phone;
import com.gupao.teach.pattern.factory.abstractfactory.video.AppleVideo;
import com.gupao.teach.pattern.factory.abstractfactory.video.HuaWeiVideo;
import com.gupao.teach.pattern.factory.abstractfactory.video.Video;

public class AppleFactory implements IAbstractFactory {
    public Phone getPhone() {
        return new ApplePhone();
    }

    public Audio getAudio() {
        return new AppleAudio();
    }

    public Video getVideo() {
        return new AppleVideo();
    }
}
