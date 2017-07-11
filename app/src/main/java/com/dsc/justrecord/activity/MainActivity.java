package com.dsc.justrecord.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.dsc.justrecord.R;
import com.dsc.justrecord.fragment.EarnFragment;
import com.dsc.justrecord.fragment.PayFragment;
import com.dsc.justrecord.fragment.StatFragment;
import com.dsc.justrecord.util.ToastUtil;

public class MainActivity extends AppCompatActivity {

    private EarnFragment mEarnFragment;
    private PayFragment mPayFragment;
    private StatFragment mStatFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fm = MainActivity.this.getFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if (mEarnFragment == null) {
                        mEarnFragment = EarnFragment.newInstance();
                    }
                    transaction.replace(R.id.content, mEarnFragment);
                    transaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    if (mStatFragment == null) {
                        mStatFragment = StatFragment.newInstance();
                    }
                    transaction.replace(R.id.content, mStatFragment);
                    transaction.commit();
                    return true;
                case R.id.navigation_notifications:
                    if (mPayFragment == null) {
                        mPayFragment = PayFragment.newInstance();
                    }
                    transaction.replace(R.id.content, mPayFragment);
                    transaction.commit();
                    return true;
                default:
                    break;
            }

            return false;

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //isFirstOpen();
        setContentView(R.layout.activity_main);
        //底部导航按钮
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //底部导航按钮事件
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        setDefaultFragment();
    }

    private void isFirstOpen() {
        SharedPreferences shared = getSharedPreferences("is", MODE_PRIVATE);
        boolean isFirstOpen = shared.getBoolean("isfer", true);
        SharedPreferences.Editor editor = shared.edit();
        if (isFirstOpen) {
            //第一次进入跳转
            Intent in = new Intent(MainActivity.this, InitActivity.class);//problem ?
            startActivity(in);
            finish();
            editor.putBoolean("isfer", false);
            editor.commit();
        } else {
            //第二次进入跳转
            Intent in = new Intent(MainActivity.this, MainActivity.class);
            startActivity(in);
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                ToastUtil.showToast(MainActivity.this, "设置");
                return true;
            case R.id.action_about:
                ToastUtil.showToast(MainActivity.this, "关于");
                return true;
        }
        return false;
    }


    private void setDefaultFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mEarnFragment = EarnFragment.newInstance();
        transaction.replace(R.id.content, mEarnFragment);
        transaction.commit();
    }
}
