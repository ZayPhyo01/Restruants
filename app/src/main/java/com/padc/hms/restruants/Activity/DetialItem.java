package com.padc.hms.restruants.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.padc.hms.restruants.R;

public class DetialItem extends AppCompatActivity {
TabLayout tabLayout;
android.support.v7.widget.Toolbar toolbar;
    public static Intent newIntent(Context context){

        Intent intent = new Intent(context,DetialItem.class);
        return intent;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        tabLayout = findViewById(R.id.tb_detail);
        toolbar = findViewById(R.id.tlb);
        setSupportActionBar(toolbar);
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.details)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.menus)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.reviews)));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        TextView tv1 = (TextView)(((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(0)).getChildAt(1));
        tv1.setScaleY(-1);
        TextView tv2 = (TextView)(((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(1)).getChildAt(1));
        tv2.setScaleY(-1);
        TextView tv3 = (TextView)(((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(2)).getChildAt(1));
        tv3.setScaleY(-1);

    }
}
