package com.js.application.sample.android_study;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
            Toast.makeText(context, "비행기모드", Toast.LENGTH_SHORT).show();
        }
    }
}
