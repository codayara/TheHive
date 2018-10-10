package com.mayarafelix.thehive.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mayarafelix.thehive.ItemClickListener;
import com.mayarafelix.thehive.ItemClickOptions;
import com.mayarafelix.thehive.R;
import com.mayarafelix.thehive.holders.ItemViewHolder;
import com.mayarafelix.thehive.models.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayca on 10/8/2018.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<Item> items;
    private ItemClickListener listener;

    public ItemAdapter(ItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder, parent, false);
        return new ItemViewHolder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Item item = items.get(position);
        holder.getNameView().setText(item.getName());
        holder.getQuantityView().setText(item.getQuantityDescription());
    }

    public void updateData(List<Item> items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }

        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    public void updateData(int option, int position, View quantityView) {
        Item item = items.get(position);
        if (ItemClickOptions.ADD.getCode() == option) {
            item.increaseQuantity();
        } else {
            item.decreaseQuantity();
        }
        ((TextView) quantityView).setText(item.getQuantityDescription());
    }

    @Override
    public int getItemCount() {
        return (items!= null? items.size():0);
    }
}
