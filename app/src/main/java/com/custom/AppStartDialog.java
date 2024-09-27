package com.custom;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.github.tvbox.osc.base.BaseActivity;

public class AppStartDialog {
    public static void showReminder(Context context) {
        if(BaseActivity.startFlag){
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("提醒");
            builder.setMessage("试用版 10分钟后会退出APP");
            builder.setPositiveButton("确定", (dialog, which) -> dialog.dismiss());
            builder.show();
            BaseActivity.startFlag=false;
        }

    }
}
