package com.yokmama.learn10.chapter05.lesson22;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button�̃C���X�^���X���擾
        Button button = (Button) findViewById(R.id.button);

        //Button�ɃJ�E���g���Z�b�g
        SharedPreferences preference =
                PreferenceManager.getDefaultSharedPreferences(this);
        int count = preference.getInt("count", 0);
        button.setText("Count:" + count);

        //���X�i�[���Z�b�g
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //BroadcastReceiver�ŃJ�E���g�A�b�v�����s
                Intent intent = new Intent(MainActivity.this, MyReceiver.class);
                intent.setAction("up");
                sendBroadcast(intent);
            }
        });
    }
}
