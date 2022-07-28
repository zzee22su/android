package com.js.application.sample.android_study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnOnOff;
    private Receiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnOnOff = findViewById(R.id.btnOnOff);
        mReceiver = new Receiver();

        mBtnOnOff.setOnClickListener(this);


        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(mReceiver, intentFilter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOnOff:
                if(mBtnOnOff.getText()=="ON") {
                    mBtnOnOff.setText("OFF");
                } else {
                    mBtnOnOff.setText("ON");
                }
                break;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mReceiver);
    }
}