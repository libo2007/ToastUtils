package com.libo.toastutils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    public static void showToast(Context context,String content){
        String contents = "这是第一个版本" + content;
        Toast.makeText(context,contents,Toast.LENGTH_LONG).show();
    }
}
