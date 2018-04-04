package com.kserno.baseclasses;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by filipsollar on 4.4.18.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mUnbinder = ButterKnife.bind(this);
        createPresenter();
        if (getPresenter() != null) {
            getPresenter().start();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (getPresenter() != null) {
            getPresenter().stop();
        }
        mUnbinder.unbind();
    }

    /**
     * Here should be presenter created either with dagger or manually
     */
    protected abstract void createPresenter();

    /**
     * @return Instance of presenter controlling the view
     */
    protected abstract BasePresenter getPresenter();

    /**
     * @return Layout for this activity
     */
    @LayoutRes
    protected abstract int getLayoutId();


}
