package com.mayarafelix.thehive.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mayarafelix.thehive.R;

/**
 * Created by mayca on 10/8/2018.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder{

    private TextView nameView;
    private TextView quantityView;
    private ImageButton addBtn;
    private ImageButton removeBtn;

    public ItemViewHolder(View itemView, TextView nameView, TextView quantityView, ImageButton addBtn, ImageButton removeBtn) {
        super(itemView);
        this.nameView = nameView;
        this.quantityView = quantityView;
        this.addBtn = addBtn;
        this.removeBtn = removeBtn;
    }

    public ItemViewHolder(View view)
    {
        super(view);
        nameView = view.findViewById(R.id.name);
        quantityView = view.findViewById(R.id.quantity);
        addBtn = view.findViewById(R.id.addButton);
        removeBtn = view.findViewById(R.id.removeButton);
    }

    public TextView getNameView() {
        return nameView;
    }

    public void setNameView(TextView nameView) {
        this.nameView = nameView;
    }

    public TextView getQuantityView() {
        return quantityView;
    }

    public void setQuantityView(TextView quantityView) {
        this.quantityView = quantityView;
    }

    public ImageButton getAddBtn() {
        return addBtn;
    }

    public void setAddBtn(ImageButton addBtn) {
        this.addBtn = addBtn;
    }

    public ImageButton getRemoveBtn() {
        return removeBtn;
    }

    public void setRemoveBtn(ImageButton removeBtn) {
        this.removeBtn = removeBtn;
    }
}
