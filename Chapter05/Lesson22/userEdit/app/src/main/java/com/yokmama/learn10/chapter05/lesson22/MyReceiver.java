package com.yokmama.learn10.chapter05.lesson22;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = MyReceiver.class.getSimpleName();

    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("up".equals(intent.getAction())) {
            //�J�E���g��ǂݍ���
            SharedPreferences preferences =
                    PreferenceManager.getDefaultSharedPreferences(context);
            int count = preferences.getInt("count", 0);

            //�J�E���g�A�b�v
            count++;

            //�J�E���g��ۑ�
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("count", count);
            editor.commit();

            Log.d(TAG, "count=" + count);
        }
    }
}
