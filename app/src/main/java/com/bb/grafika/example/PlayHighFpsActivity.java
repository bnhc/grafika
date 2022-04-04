package com.bb.grafika.example;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.TextureView;

import com.android.grafika.R;

public class PlayHighFpsActivity extends Activity {

    private TextureView playhigh_tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playhighactivity);
        initView();
    }

    private void initView() {
        playhigh_tv = findViewById(R.id.playhigh_tv);
    }
}
