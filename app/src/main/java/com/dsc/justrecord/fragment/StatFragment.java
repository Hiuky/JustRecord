package com.dsc.justrecord.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dsc.justrecord.R;

/**
 * Created by HQ on 2017/7/11.
 */

public class StatFragment extends Fragment {


    public static StatFragment newInstance() {
        StatFragment statFragment = new StatFragment();
//        Bundle args = new Bundle();
//        args.putString("args1", param1);
//        statFragment.setArguments(args);
        return statFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.stat, container, false);
        return view;
    }
}
