package com.dsc.justrecord.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dsc.justrecord.R;
import com.dsc.justrecord.adapter.DSCViewPagerAdapter;
import com.dsc.justrecord.util.ToastUtil;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private View viewPay;
    private View viewEarn;
    private View viewStat;
    private List<View> viewList;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mViewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    mViewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:
                    mViewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //viewPager容纳三个主页面元素
        mViewPager = (ViewPager) findViewById(R.id.viewPager);

        //Button btnPayChooseDate = (Button) findViewById(R.id.buttonPayChooseDate);

        //从配置文件加载要显示的viewPager
        LayoutInflater inflater = getLayoutInflater();
        viewPay = inflater.inflate(R.layout.pay, null);
        viewStat = inflater.inflate(R.layout.stat, null);
        viewEarn = inflater.inflate(R.layout.earn, null);

        // 将要分页显示的View装入数组中
        viewList = new ArrayList<>();
        viewList.add(viewPay);
        viewList.add(viewStat);
        viewList.add(viewEarn);
        //给viewPager设置显示适配器
        mViewPager.setAdapter(new DSCViewPagerAdapter(viewList));

        //底部导航按钮
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //底部导航按钮事件
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Calendar ca = Calendar.getInstance();
        final int mYear = ca.get(Calendar.YEAR);
        final int mMonth = ca.get(Calendar.MONTH);
        final int mDay = ca.get(Calendar.DAY_OF_MONTH);
        mViewPager.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                ToastUtil.showToast(MainActivity.this, Integer.toString(v.getId()));
            }
        });
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
}
