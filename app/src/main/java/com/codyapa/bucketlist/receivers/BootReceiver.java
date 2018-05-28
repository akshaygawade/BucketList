package com.codyapa.bucketlist.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.codyapa.bucketlist.extras.Util;

/**
 * Created by vivek on 21/10/17.
 */

public class BootReceiver extends BroadcastReceiver {
    public BootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Util.scheduleAlarm(context);
    }
}
