package com.example.launchmode.activity;

import android.content.Context;
import android.content.Intent;

/**
 * Created by youngbear on 16/9/24.
 */

public class Utils {

    public static final String TAG = "bearyang";

    public static void startActivity(Context context,Class<?> cls) {
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }
}
