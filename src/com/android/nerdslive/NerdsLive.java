package com.android.nerdslive;

import android.app.Activity;
import android.os.Bundle;

public class NerdsLive extends Activity {

    private NerdsLiveView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new NerdsLiveView(this);
        setContentView(mView);
    }
}
