package com.ddy.quarter.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ddy.quarter.presenter.BasePresenter;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * date:2018/1/19  14:05
 * author:Mr.XIn💕
 */

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {
    T presenter;
    private Unbinder bind;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        bridge();
        bind = ButterKnife.bind(this);
        presenter = getPresenter();
        if (presenter != null) {
            presenter.attch((V) this);
        }
        initView();
        logic();
    }


    protected abstract int setLayout();

    protected abstract void bridge();

    protected abstract T getPresenter();

    protected abstract void initView();

    protected abstract void logic();

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.disAttch();
        bind.unbind();
    }
}