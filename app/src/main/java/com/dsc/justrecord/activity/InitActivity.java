package com.dsc.justrecord.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dsc.justrecord.R;

/**
 * Created by EricHuang on 2017/7/11.
 * 初始化Activity
 * 首次使用没有数据库信息时，显示本Activity
 * <p>
 * <p>
 * DSC All Right Reserved
 * DSC 1999-2017
 */

public class InitActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
    }
}
