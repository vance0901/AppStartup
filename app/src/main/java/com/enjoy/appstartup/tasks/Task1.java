package com.enjoy.appstartup.tasks;

import android.content.Context;
import android.os.SystemClock;

import androidx.annotation.Nullable;

import com.enjoy.appstartup.LogUtils;
import com.enjoy.appstartup.startup.AndroidStartup;
import com.enjoy.appstartup.startup.Startup;

import java.util.List;

public class Task1 extends AndroidStartup<String> {

    @Nullable
    @Override
    public String create(Context context) {
        LogUtils.log("学习Java基础");
        SystemClock.sleep(3_000);
        LogUtils.log("掌握Java基础");
        return "Task1返回数据";
    }


    //执行此任务需要依赖哪些任务
    @Override
    public List<Class<? extends Startup<?>>> dependencies() {
        return super.dependencies();
    }
}