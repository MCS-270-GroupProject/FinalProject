package com.example.wholettheclothesout

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.wholettheclothesout.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        PrefUtil.setTimerState(PittmanActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}