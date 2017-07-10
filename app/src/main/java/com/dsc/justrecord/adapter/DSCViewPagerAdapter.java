package com.dsc.justrecord.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.dsc.justrecord.R;
import com.dsc.justrecord.activity.MainActivity;

import java.util.List;

/**
 * Created by eric on 2017/7/10.
 */

public class DSCViewPagerAdapter extends PagerAdapter {

    private List<View> views;

    public DSCViewPagerAdapter(List<View> views) {
        this.views = views;
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(views.get(position));
        return views.get(position);
    }


}
