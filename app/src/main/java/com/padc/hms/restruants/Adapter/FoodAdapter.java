package com.padc.hms.restruants.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.hms.restruants.R;
import com.padc.hms.restruants.delegate.TapListener;
import com.padc.hms.restruants.views.holders.FoodHolder;

public class FoodAdapter extends RecyclerView.Adapter<FoodHolder> {
    TapListener tapListener;

    public FoodAdapter(TapListener tapListener) {
        this.tapListener = tapListener;
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item_view, parent, false);
        return new FoodHolder(view,tapListener);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
