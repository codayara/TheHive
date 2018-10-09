package com.mayarafelix.thehive.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayarafelix.thehive.R;
import com.mayarafelix.thehive.holders.ItemViewHolder;
import com.mayarafelix.thehive.models.Item;

import java.util.List;

/**
 * Created by mayca on 10/8/2018.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<Item> items;

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder, parent, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Item item = items.get(position);
        holder.getNameView().setText(item.getName());
        holder.getQuantityView().setText(item.getQuantity());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
