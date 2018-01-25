package com.ddy.quarter.presenter;

import com.ddy.quarter.model.Main_model;
import com.ddy.quarter.view.iview.Main_view;

import javax.inject.Inject;

/**
 * date:2018/1/19  14:33
 * author:Mr.XIn💕
 */


public class Main_presenter extends BasePresenter<Main_view> {
    @Inject
    Main_model mMain_model;
    @Inject
    public Main_presenter() {
    }
}
