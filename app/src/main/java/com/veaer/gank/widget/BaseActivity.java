package com.veaer.gank.widget;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Veaer on 15/8/15.
 */
public class BaseActivity extends AppCompatActivity {

    public < T extends View> T $(int id) {
        return (T)super.findViewById(id);
    }

    public void hideView(int id) {
        findViewById(id).setVisibility(View.GONE);
    }

    public void showView(int id) {
        findViewById(id).setVisibility(View.VISIBLE);
    }

    public Typeface getFont() {
        return Typeface.createFromAsset(getAssets(), "fonts/SiYuan.otf");
    }
}
