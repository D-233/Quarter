package com.ddy.quarter.presenter;

import com.ddy.quarter.model.Recommend_model;
import com.ddy.quarter.view.iview.Recommend_view;

import javax.inject.Inject;

/**
 * date:2018/1/19  14:17
 * author:Mr.XIn💕
 */


public class Recommend_presenter extends BasePresenter<Recommend_view> {
    @Inject
    public Recommend_presenter() {
    }
    @Inject
    Recommend_model mRecommend_model;
}
