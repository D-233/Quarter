package com.ddy.quarter.view.framgent;

import android.view.View;

import com.ddy.quarter.R;
import com.ddy.quarter.other.DaggerIComponent;
import com.ddy.quarter.other.IModule;
import com.ddy.quarter.presenter.Video_presenter;
import com.ddy.quarter.view.iview.Video_view;

import javax.inject.Inject;

public class Video extends BaseFragment<Video_view, Video_presenter> implements Video_view {
    @Inject
    Video_presenter mVideoPresenter;

    @Override
    protected int setLayout() {
        return R.layout.video_layout;
    }

    @Override
    protected void bridge() {
        DaggerIComponent.builder().iModule(new IModule()).build().injectVideo(this);
    }

    @Override
    protected Video_presenter getPresenter() {
        return mVideoPresenter;
    }

    @Override
    protected void initView(View mview) {

    }

    @Override
    protected void logic() {

    }
}
