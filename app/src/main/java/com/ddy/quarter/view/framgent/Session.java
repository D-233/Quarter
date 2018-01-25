package com.ddy.quarter.view.framgent;

import android.view.View;

import com.ddy.quarter.R;
import com.ddy.quarter.other.DaggerIComponent;
import com.ddy.quarter.other.IModule;
import com.ddy.quarter.presenter.Session_presenter;
import com.ddy.quarter.view.iview.Session_view;

import javax.inject.Inject;

/**
 * date:2018/1/19  18:21
 * author:Mr.XIn💕
 */


public class Session extends BaseFragment<Session_view,Session_presenter>implements Session_view {
  @Inject
  Session_presenter mSession_presenter;
    @Override
    protected int setLayout() {
        return R.layout.session_layout;
    }

    @Override
    protected void bridge() {
        DaggerIComponent.builder().iModule(new IModule()).build().injectSession(this);

    }

    @Override
    protected Session_presenter getPresenter() {
        return mSession_presenter;
    }

    @Override
    protected void initView(View mview) {
    }

    @Override
    protected void logic() {

    }
}
