package com.ddy.quarter.other;

import com.ddy.quarter.view.activity.MainActivity;
import com.ddy.quarter.view.framgent.Picture;
import com.ddy.quarter.view.framgent.Recommend;
import com.ddy.quarter.view.framgent.Session;
import com.ddy.quarter.view.framgent.Video;

import dagger.Component;

@Component(modules = IModule.class)
public interface IComponent {
    void injectMain(MainActivity mainActivity);

    void injectRecommend(Recommend recommend);

    void injectSession(Session session);

    void injectVideo(Video video);

    void injectPicture(Picture picture);
}
