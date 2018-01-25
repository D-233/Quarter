package com.ddy.quarter.presenter;

import com.ddy.quarter.model.Session_model;
import com.ddy.quarter.view.iview.Session_view;

import javax.inject.Inject;

/**
 * date:2018/1/19  14:17
 * author:Mr.XIn💕
 */


public class Session_presenter extends BasePresenter<Session_view> {
    @Inject
    public Session_presenter() {
    }
    @Inject
    Session_model mSession_model;
}
