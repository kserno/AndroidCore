package com.kserno.baseclasses;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by filipsollar on 5.4.18.
 */

public class BaseViewPager extends FragmentStatePagerAdapter {

    private List<BaseFragment> mFragments = new ArrayList<>();

    public BaseViewPager(FragmentManager fm) {
        super(fm);
    }

    public BaseViewPager(FragmentManager fm, List<BaseFragment> fragments) {
        super(fm);
        mFragments.addAll(fragments);
    }

    public BaseViewPager(FragmentManager fm, BaseFragment[] fragments) {
        super(fm);
        mFragments.addAll(Arrays.asList(fragments));
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public void addData(List<BaseFragment> fragments) {
        mFragments.addAll(fragments);
        notifyDataSetChanged();
    }

    public void setData(List<BaseFragment> fragments) {
        mFragments.clear();
        addData(fragments);
    }
}
