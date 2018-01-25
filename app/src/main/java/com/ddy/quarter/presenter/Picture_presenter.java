package com.ddy.quarter.presenter;

import com.ddy.quarter.model.Picture_model;
import com.ddy.quarter.view.iview.Picture_view;

import javax.inject.Inject;

public class Picture_presenter extends BasePresenter<Picture_view> {
    @Inject
    public Picture_presenter() {
    }

    @Inject
    Picture_model mVideo_model;
}
