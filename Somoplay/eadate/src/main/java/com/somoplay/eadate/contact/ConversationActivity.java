package com.somoplay.eadate.contact;


import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.somoplay.eadate.R;

/**
 * Created by Frank on 15/12/6.
 */
public class ConversationActivity extends AppCompatActivity {
    private static final String TAG = ConversationActivity.class.getSimpleName();

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //唯一有用的代码，加载一个 layout
        setContentView(R.layout.fragment_conversation);
        //继承的是ActionBarActivity，直接调用 自带的 Actionbar，下面是Actionbar 的配置，如果不用可忽略…
        getSupportActionBar().setTitle("聊天");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.de_actionbar_back);
    }
}
