package com.dsc.justrecord.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by eric on 2017/6/27.
 */

public class ToastUtil {
    private static Toast toast;

    public static void showToast(Context context, CharSequence charSequence) {
        if (toast != null) {
            toast.setText(charSequence);
            toast.show();
        } else {
            toast = Toast.makeText(context, charSequence, Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
