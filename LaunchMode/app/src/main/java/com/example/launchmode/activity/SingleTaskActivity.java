package com.example.launchmode.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.launchmode.R;

public class SingleTaskActivity extends Activity {

    private Context mContext;

    private static final String TAG = "bearyang" + SingleTaskActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate...");
        mContext = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
        initViews();
    }

    private void initViews() {
        TextView txtShow = (TextView) findViewById(R.id.txt_show);
        String content = this.toString();
        txtShow.setText(content);

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
    protected void onStart() {
        Log.d(TAG, "onStart...");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart...");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume...");
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState...");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.d(TAG, "onNewIntent...");
        super.onNewIntent(intent);
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause...");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop...");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy...");
        super.onDestroy();
    }
}
