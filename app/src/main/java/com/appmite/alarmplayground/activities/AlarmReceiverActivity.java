package com.appmite.alarmplayground.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.appmite.alarmplayground.R;
import com.google.android.exoplayer.util.DebugTextViewHelper;
import com.google.android.exoplayer.util.Util;

public class AlarmReceiverActivity extends BroadcastReceiver /*implements Player.Listener*/ {

    //SoundPool mySoundPool;
    //private Player player;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_alarm_receiver);
////        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
////        setSupportActionBar(toolbar);
////
////        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
////        fab.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
////            }
////        });
//    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm Triggered and SMS Sent", Toast.LENGTH_LONG).show();

        //mySoundPool = new SoundPool.Builder()
        //        .setMaxStreams(10)
        //        .build();

        preparePlayer(true);


    }

    private void preparePlayer(boolean playWhenReady) {
//        if (player == null) {
//            player = new Player();
//            //player.addListener(this);
//            //player.setCaptionListener(this);
//            //player.setMetadataListener(this);
//            //player.seekTo(playerPosition);
//            //playerNeedsPrepare = true;
//            //mediaController.setMediaPlayer(player.getPlayerControl());
//            //mediaController.setEnabled(true);
//            //eventLogger = new EventLogger();
//            //eventLogger.startSession();
//            //player.addListener(eventLogger);
//            //player.setInfoListener(eventLogger);
//            //player.setInternalErrorListener(eventLogger);
//            //debugViewHelper = new DebugTextViewHelper(player, debugTextView);
//            //debugViewHelper.start();
//        }
//        //if (playerNeedsPrepare) {
//            player.prepare();
//            //playerNeedsPrepare = false;
//            //updateButtonVisibilities();
//        //}
//        //player.setSurface(surfaceView.getHolder().getSurface());
//        //player.setPlayWhenReady(playWhenReady);
    }

//    @Override
//    public void onStateChanged(boolean playWhenReady, int playbackState) {
//
//    }
//
//    @Override
//    public void onError(Exception e) {
//
//    }
//
//    @Override
//    public void onVideoSizeChanged(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
//
//    }
}
