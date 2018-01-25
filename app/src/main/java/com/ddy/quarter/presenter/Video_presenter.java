package com.ddy.quarter.presenter;

import com.ddy.quarter.model.video_model;
import com.ddy.quarter.view.iview.Video_view;

import javax.inject.Inject;

/**
 * date:2018/1/19  14:17
 * author:Mr.XIn💕
 */


public class Video_presenter extends BasePresenter<Video_view> {
    @Inject
    public Video_presenter() {
    }

    @Inject
    video_model mVideo_model;
}
