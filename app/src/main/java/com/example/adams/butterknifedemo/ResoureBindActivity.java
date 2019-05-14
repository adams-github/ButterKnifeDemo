package com.example.adams.butterknifedemo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;

/**
 * create by zl on 2019/5/13
 */
public class ResoureBindActivity extends Activity {

    @BindString(R.string.app_name)
    String appName;

    @BindColor(R.color.colorPrimary)
    int colorPrimary;

    @BindDrawable(R.mipmap.ic_launcher)
    Drawable icLauncher;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
