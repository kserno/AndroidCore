package com.kserno.baseclasses;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.widget.RecyclerView;


/**
 * Created by filipsollar on 24.1.18.
 */

public abstract class BaseRecyclerAdapter<T, VH extends BaseViewHolder<T>> extends RecyclerView.Adapter<VH> {

    private List<T> mData;
    private List<ItemClickListener<T>> mListeners;

    public BaseRecyclerAdapter() {
        mData = new ArrayList<>();
        mListeners = new ArrayList<>();
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.update(mData.get(position));
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        final VH holder = createViewHolder(parent.getContext(), parent, viewType);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                for (ItemClickListener<T> listener: mListeners) {
                    listener.onItemClicked(mData.get(position));
                }
            }
        });
        return holder;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void addData(List<T> data) {
        int size = mData.size();
        mData.addAll(data);
        notifyItemRangeInserted(size, data.size());
    }

    public void setData(List<T> data) {
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }

    public void addListener(ItemClickListener<T> listener) {
        mListeners.add(listener);
    }

    public void removeListener(ItemClickListener<T> listener) {
        mListeners.remove(listener);
    }

    protected List<T> getData() {
        return mData;
    }

    protected List<ItemClickListener<T>> getListeners() {
        return mListeners;
    }

    protected abstract VH createViewHolder(Context context, ViewGroup parent, int viewType);

    public interface ItemClickListener<T> {
        void onItemClicked(T item);
    }
}
