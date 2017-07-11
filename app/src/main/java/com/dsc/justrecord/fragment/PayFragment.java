package com.dsc.justrecord.fragment;

import android.app.DatePickerDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.dsc.justrecord.R;

import java.util.Calendar;


/**
 * Created by HQ on 2017/7/11.
 */

public class PayFragment extends Fragment {

    private Button btnSetDate;
    private TextView textViewPayDate;

    public PayFragment() {
    }

    public static PayFragment newInstance() {
        PayFragment payFragment = new PayFragment();
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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnSetDate = (Button) getActivity().findViewById(R.id.buttonSetDate);
        textViewPayDate = (TextView) getActivity().findViewById(R.id.textViewPayDate);
        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH) + 1;
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        textViewPayDate.setText(year + "年" + month + "月" + day + "日");
        btnSetDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        //日期选定后的事件
                        textViewPayDate.setText(year + " " + (month + 1) + " " + dayOfMonth);
                    }
                }, year, month-1, day).show();
            }
        });
    }
}
