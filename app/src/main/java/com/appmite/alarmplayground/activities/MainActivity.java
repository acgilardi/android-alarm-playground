package com.appmite.alarmplayground.activities;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.appmite.alarmplayground.R;
import com.appmite.alarmplayground.data.AlaramDataAdapter;
import com.appmite.alarmplayground.data.AlarmData;

public class MainActivity extends AppCompatActivity {

    private AlarmData mAlarmData;
    private AlarmManager mAlarmManager;

    private Intent mReceiveIntentSingleSound;
    private PendingIntent mReceivePendingIntentSingleSound;


    private PendingIntent mReceivePendingIntentMultiSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.intents_recycler_view);
//        mAlarmData = new AlarmData();
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        AlaramDataAdapter mAdapter = new AlaramDataAdapter(mAlarmData.getIntentData());
//        recyclerView.setAdapter(mAdapter);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mAlarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        mReceiveIntentSingleSound = new Intent(MainActivity.this, AlarmReceiverActivity.class);
        mReceivePendingIntentSingleSound = PendingIntent.getBroadcast(MainActivity.this, 0, mReceiveIntentSingleSound, 0);

        Button singleAlarmButton = (Button)findViewById(R.id.set_single_alarm);
        singleAlarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAlarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 3000L, mReceivePendingIntentSingleSound);
                mAlarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 3000L + 2000L, mReceivePendingIntentSingleSound);
                Toast.makeText(MainActivity.this, "Single Alarm Set", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
