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

public class PayFragment extends Fragment {
    public PayFragment() {
    }

    public static PayFragment newInstance(String param1) {
        PayFragment payFragment = new PayFragment();
        Bundle args = new Bundle();
        args.putString("args1", param1);
        payFragment.setArguments(args);
        return payFragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pay, container, false);
        return view;
    }
}
