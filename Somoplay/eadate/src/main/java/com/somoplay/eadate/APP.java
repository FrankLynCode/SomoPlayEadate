package com.somoplay.eadate;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.util.Log;

import io.rong.imkit.RongIM;

/**
 * Created by Frank on 15/12/5.
 */
public class APP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * init RongCloud
         */
        RongIM.init(this);
        Log.d("APP",getApplicationInfo().packageName+"="+getCurProcessName(getApplicationContext()));
        if (getApplicationInfo().packageName.equals(getCurProcessName(getApplicationContext()))) {

            DemoContext.init(this);
        }
    }


    /**
     * 获得当前进程的名字
     *
     * @param context
     * @return
     */
    public static String getCurProcessName(Context context) {

        int pid = android.os.Process.myPid();

        ActivityManager activityManager = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);

        for (ActivityManager.RunningAppProcessInfo appProcess : activityManager
                .getRunningAppProcesses()) {

            if (appProcess.pid == pid) {

                return appProcess.processName;
            }
        }
        return null;
    }

}
