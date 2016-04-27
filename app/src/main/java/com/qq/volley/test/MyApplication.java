package com.qq.volley.test;

import android.app.Application;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Administrator on 2016/4/26.
 */
public class MyApplication extends Application {

    private static final String TAG = "MyApplication";
    public static RequestQueue queues;

    @Override
    public void onCreate() {
        super.onCreate();
        queues = Volley.newRequestQueue(this);
        Log.d(TAG, "onCreate: ");
    }

    public static RequestQueue getQueues() {
        return queues;
    }
}
