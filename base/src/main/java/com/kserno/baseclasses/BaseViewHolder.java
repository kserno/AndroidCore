package com.kserno.baseclasses;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by filipsollar on 24.1.18.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    private T mItem;

    public BaseViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void update(T item) {
        mItem = item;
        update();
    }

    protected T getItem() {
        return mItem;
    }

    protected abstract void update();


}
