package com.gupao.teach.pattern.factory.abstractfactory;

import com.gupao.teach.pattern.factory.abstractfactory.audio.Audio;
import com.gupao.teach.pattern.factory.abstractfactory.audio.XiaoMiAudio;
import com.gupao.teach.pattern.factory.abstractfactory.phone.Phone;
import com.gupao.teach.pattern.factory.abstractfactory.phone.XiaoMiPhone;
import com.gupao.teach.pattern.factory.abstractfactory.video.Video;
import com.gupao.teach.pattern.factory.abstractfactory.video.XiaoMiVideo;

public class XiaoMiFactory implements IAbstractFactory {
    public Phone getPhone() {
        return new XiaoMiPhone();
    }

    public Audio getAudio() {
        return new XiaoMiAudio();
    }

    public Video getVideo() {
        return new XiaoMiVideo();
    }
}
