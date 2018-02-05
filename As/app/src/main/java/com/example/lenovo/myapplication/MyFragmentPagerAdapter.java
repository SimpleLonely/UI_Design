package com.example.lenovo.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

/**
 * Created by lenovo on 2018/2/5.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private final int PAGER_COUNT = 2;
    private FgFavourite myFragment1 = null;
    private FgHistory myFragment2 = null;


    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        myFragment1 = new FgFavourite();
        myFragment2 = new FgHistory();
    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        System.out.println("position Destory" + position);
        super.destroyItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case HistoryFavouriteActivity.PAGE_ONE:
                fragment = myFragment1;
                break;
            case HistoryFavouriteActivity.PAGE_TWO:
                fragment = myFragment2;
                break;
        }
        return fragment;
    }

}
