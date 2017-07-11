package com.dsc.justrecord.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by eric on 2017/6/27.
 */

public class ToastUtil {
    private static Toast toast;

    public static void showToast(Context context, String msg) {
        if (toast != null) {
            toast.setText(msg);
            toast.show();
        } else {
            toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
