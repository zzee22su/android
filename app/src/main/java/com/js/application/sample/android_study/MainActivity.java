package com.js.application.sample.android_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnOnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnOnOff = findViewById(R.id.btnOnOff);

        mBtnOnOff.setOnClickListener(this);
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
}