package com.gupao.teach.pattern.factory.abstractfactory;

import com.gupao.teach.pattern.factory.abstractfactory.audio.Audio;
import com.gupao.teach.pattern.factory.abstractfactory.phone.Phone;
import com.gupao.teach.pattern.factory.abstractfactory.video.Video;

public interface IAbstractFactory {

    public Phone getPhone();

    public Audio getAudio();

    public Video getVideo();

}
