package com.ddy.quarter.view.framgent;

import android.view.View;
import android.widget.TextView;

import com.ddy.quarter.R;
import com.ddy.quarter.other.DaggerIComponent;
import com.ddy.quarter.other.IModule;
import com.ddy.quarter.presenter.Picture_presenter;
import com.ddy.quarter.view.iview.Picture_view;

import javax.inject.Inject;

import butterknife.BindView;

public class Picture extends BaseFragment<Picture_view, Picture_presenter> implements Picture_view {
    @Inject
    Picture_presenter mVideoPresenter;
    @BindView(R.id.ss)
    TextView mSs;

    @Override
    protected int setLayout() {
        return R.layout.picture_layout;
    }

    @Override
    protected void bridge() {
        DaggerIComponent.builder().iModule(new IModule()).build().injectPicture(this);

    }

    @Override
    protected Picture_presenter getPresenter() {
        return mVideoPresenter;
    }

    @Override
    protected void initView(View mview) {

    }

    @Override
    protected void logic() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
