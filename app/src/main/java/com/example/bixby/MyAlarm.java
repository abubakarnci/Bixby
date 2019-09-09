package com.example.bixby;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;



//class extending the Broadcast Receiver
public class MyAlarm extends BroadcastReceiver {

    //the method will be fired when the alarm is triggerred
    @Override
    public void onReceive(Context context, Intent intent) {


        MediaPlayer mediaPlayer=MediaPlayer.create(context,
                Settings.System.DEFAULT_ALARM_ALERT_URI);
        mediaPlayer.start();




    }


}
