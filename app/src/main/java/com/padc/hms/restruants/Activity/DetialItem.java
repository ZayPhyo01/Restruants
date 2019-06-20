package com.padc.hms.restruants.Activity;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.padc.hms.restruants.R;

public class DetialItem extends AppCompatActivity {
    TabLayout tabLayout;
    TextView tvTime, tvHome, tvLocation, tvMap;
    android.support.v7.widget.Toolbar toolbar;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, DetialItem.class);
        return intent;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        tabLayout = findViewById(R.id.tb_detail);
        toolbar = findViewById(R.id.tlb);
        setSupportActionBar(toolbar);
        tvTime = findViewById(R.id.tv_time);
        tvHome = findViewById(R.id.tv_home);
        tvMap = findViewById(R.id.tv_map);
        tvLocation = findViewById(R.id.tv_location);

        setWithAnimation();

        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.details)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.menus)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.reviews)));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        ImageView imageView = findViewById(R.id.resturants_image);
        imageView.setTransitionName("image");

        TextView tv1 = (TextView) (((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(0)).getChildAt(1));
        tv1.setScaleY(-1);
        TextView tv2 = (TextView) (((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(1)).getChildAt(1));
        tv2.setScaleY(-1);
        TextView tv3 = (TextView) (((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(2)).getChildAt(1));
        tv3.setScaleY(-1);

    }

    private void setWithAnimation() {
        ObjectAnimator tvTimeAnim = ObjectAnimator.ofFloat(tvTime, View.ALPHA, 0.1f,1);
        tvTimeAnim.setDuration(2200);
        tvTimeAnim.start();

        ObjectAnimator tvLocationAnim = ObjectAnimator.ofFloat(tvLocation,View.ALPHA,0.1f,1f);
        tvLocationAnim.setDuration(3200);
        tvLocationAnim.start();

        ObjectAnimator tvMapAnim = ObjectAnimator.ofFloat(tvMap,View.ALPHA,0.1f,1f);
        tvMapAnim.setDuration(5500);
        tvMapAnim.start();

        ObjectAnimator tvHomeAnim = ObjectAnimator.ofFloat(tvHome,View.ALPHA,0.1f,1f);
        tvHomeAnim.setDuration(7500);
        tvHomeAnim.start();


    }
}
