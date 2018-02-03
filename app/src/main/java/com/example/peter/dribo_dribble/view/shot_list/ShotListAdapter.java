package com.example.peter.dribo_dribble.view.shot_list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.peter.dribo_dribble.R;
import com.example.peter.dribo_dribble.model.Shot;

import java.util.List;

/**
 * Created by peter on 2018/2/2.
 */

class ShotListAdapter extends RecyclerView.Adapter {

    private List<Shot> data;

    public ShotListAdapter(@NonNull List<Shot> data) {
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_shot, parent, false);
        return new ShotViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
