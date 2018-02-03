package com.example.peter.dribo_dribble.view.shot_list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.peter.dribo_dribble.R;
import com.example.peter.dribo_dribble.view.base.BaseViewHolder;

import butterknife.BindView;

/**
 * Created by peter on 2018/2/2.
 */

class ShotViewHolder extends BaseViewHolder {

//    @BindView(R.id.shot_clickable_cover) public View cover;
    @BindView(R.id.shot_like_count) public TextView likeCount;
    @BindView(R.id.shot_bucket_count) public TextView bucketCount;
    @BindView(R.id.shot_view_count) public TextView viewCount;
    @BindView(R.id.shot_image) public ImageView image;

    public ShotViewHolder(View itemView) {
        super(itemView);
    }
}
