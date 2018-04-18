package com.kserno.androidcore;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.kserno.baseclasses.BaseActivity;
import com.kserno.baseclasses.BasePresenter;
import com.kserno.collapsingheader.CollapsingHeader;
import com.kserno.collapsingheader.CollapsingHeaderModel;

import butterknife.BindView;

/**
 * Created by filipsollar on 5.4.18.
 */

public class MainActivity extends BaseActivity{

    @BindView(R.id.collapsing_header) CollapsingHeader mCollapsingHeader;


    @Override
    protected void createPresenter() {

    }

    @Override
    protected BasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initializeViews() {
        System.out.println(mCollapsingHeader);
    }
}
