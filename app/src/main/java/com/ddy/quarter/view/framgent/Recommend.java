package com.ddy.quarter.view.framgent;

import android.view.View;

import com.ddy.quarter.R;
import com.ddy.quarter.other.DaggerIComponent;
import com.ddy.quarter.other.IModule;
import com.ddy.quarter.presenter.Recommend_presenter;
import com.ddy.quarter.view.iview.Recommend_view;

import javax.inject.Inject;

/**
 * date:2018/1/19  18:21
 * author:Mr.XIn💕
 */


public class Recommend extends BaseFragment<Recommend_view, Recommend_presenter> implements Recommend_view {
    @Inject
    Recommend_presenter mRecommend_presenter;

    @Override
    protected int setLayout() {
        return R.layout.recommend_layout;
    }

    @Override
    protected void bridge() {
        DaggerIComponent.builder().iModule(new IModule()).build().injectRecommend(this);

    }

    @Override
    protected Recommend_presenter getPresenter() {
        return mRecommend_presenter;
    }

    @Override
    protected void initView(View mview) {
    }

    @Override
    protected void logic() {

    }
}
