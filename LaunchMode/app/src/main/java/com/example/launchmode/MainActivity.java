package com.example.launchmode;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import com.example.launchmode.activity.SingleInstanceActivity;
import com.example.launchmode.activity.SingleTaskActivity;
import com.example.launchmode.activity.SingleTopActivity;
import com.example.launchmode.activity.StandardActivity;
import com.example.launchmode.activity.Utils;

public class MainActivity extends Activity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        initViews();
    }

    private void initViews() {
        Button btnStandard = (Button) findViewById(R.id.btn_standard);
        Button btnSingleTop = (Button) findViewById(R.id.btn_singleTop);
        Button btnSingleTask = (Button) findViewById(R.id.btn_singleTask);
        Button btnSingleInstance = (Button) findViewById(R.id.btn_singleInstance);

        btnStandard.setOnClickListener(btnClickListener);
        btnSingleTop.setOnClickListener(btnClickListener);
        btnSingleTask.setOnClickListener(btnClickListener);
        btnSingleInstance.setOnClickListener(btnClickListener);

    }

    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_standard:
                    Utils.startActivity(mContext, StandardActivity.class);
                    break;
                case R.id.btn_singleTop:
                    Utils.startActivity(mContext, SingleTopActivity.class);
                    break;
                case R.id.btn_singleTask:
                    Utils.startActivity(mContext, SingleTaskActivity.class);
                    break;
                case R.id.btn_singleInstance:
                    Utils.startActivity(mContext, SingleInstanceActivity.class);
                    break;
            }
        }
    };

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
