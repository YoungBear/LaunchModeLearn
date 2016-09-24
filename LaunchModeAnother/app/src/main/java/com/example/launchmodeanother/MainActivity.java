package com.example.launchmodeanother;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    
    private void initViews() {
        Button btnStartStandard = (Button) findViewById(R.id.btn_start_standard);
        Button btnStartSingleTop = (Button) findViewById(R.id.btn_start_single_top);
        Button btnStartSingleTask = (Button) findViewById(R.id.btn_start_single_task);
        Button btnStartSingleInstance = (Button) findViewById(R.id.btn_start_single_instance);

        btnStartStandard.setOnClickListener(btnClickListener);
        btnStartSingleTop.setOnClickListener(btnClickListener);
        btnStartSingleTask.setOnClickListener(btnClickListener);
        btnStartSingleInstance.setOnClickListener(btnClickListener);
    }

    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_start_standard:
                    startActivity("com.example.launchmode",
                            "com.example.launchmode.activity.StandardActivity");
                    break;
                case R.id.btn_start_single_top:
                    startActivity("com.example.launchmode",
                            "com.example.launchmode.activity.SingleTopActivity");
                    break;
                case R.id.btn_start_single_task:
                    startActivity("com.example.launchmode",
                            "com.example.launchmode.activity.SingleTaskActivity");
                    break;
                case R.id.btn_start_single_instance:
                    startActivity("com.example.launchmode",
                            "com.example.launchmode.activity.SingleInstanceActivity");
                    break;
            }
        }
    };

    private void startActivity(String packageName, String className) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(packageName, className);
        intent.setComponent(componentName);
        startActivity(intent);
    }
}
