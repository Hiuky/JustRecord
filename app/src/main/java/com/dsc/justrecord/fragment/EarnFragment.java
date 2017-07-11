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

public class EarnFragment extends Fragment {

    public static EarnFragment newInstance() {
        EarnFragment earnFragment = new EarnFragment();
        return earnFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.earn, container, false);
        return view;
    }
}
