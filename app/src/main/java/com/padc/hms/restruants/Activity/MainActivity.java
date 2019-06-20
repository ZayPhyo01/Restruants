package com.padc.hms.restruants.Activity;

import android.content.Intent;
import android.net.NetworkInfo;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.padc.hms.restruants.Adapter.FoodAdapter;
import com.padc.hms.restruants.R;
import com.padc.hms.restruants.delegate.TapListener;

public class MainActivity extends AppCompatActivity implements TapListener{

RecyclerView foodItemList;
android.support.v7.widget.Toolbar toolbar;
TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodItemList = findViewById(R.id.rv_food_item_list);
        toolbar = findViewById(R.id.tlb);
        setSupportActionBar(toolbar);
        title = findViewById(R.id.tv_title);
        FoodAdapter foodAdapter = new FoodAdapter(this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        foodItemList.setLayoutManager(layoutManager);
        foodItemList.setAdapter(foodAdapter);

        title.setText(" Discover \n Resturants");

    }
    /*   ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                    new Pair(ivAttraction, getString(R.string.detail_transition_name)));
            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());*/

    @Override
    public void onTap(ImageView imageView) {
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,new Pair(imageView,"image"));
        Intent intent = DetialItem.newIntent(this);
        ActivityCompat.startActivity(this,intent,activityOptionsCompat.toBundle());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}
