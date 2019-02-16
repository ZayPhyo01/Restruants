package com.padc.hms.restruants.views.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.padc.hms.restruants.R;
import com.padc.hms.restruants.delegate.TapListener;

public class FoodHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TapListener tapListener;
    Button detailItem;
    public FoodHolder(View itemView, TapListener tapListener) {
        super(itemView);
        this.tapListener = tapListener;
        detailItem = itemView.findViewById(R.id.btn_check_detail);
        detailItem.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        tapListener.onTap();
    }
}
