package com.abraun.lexxbucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketAdapter extends RecyclerView.Adapter<BucketAdapter.BucketViewHolder> {

    private Bucket[] buckets;

    public BucketAdapter(Bucket[] buckets) {
        this.buckets = buckets;
    }

    @NonNull
    @Override
    public BucketAdapter.BucketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket, parent, false);
        return new BucketViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketAdapter.BucketViewHolder holder, int position) {
        holder.bind(buckets[position]);
    }

    @Override
    public int getItemCount() {
        return buckets.length;
    }

    static class BucketViewHolder extends RecyclerView.ViewHolder{
        ImageView buckImage;
        TextView buckTitle;
        TextView buckDescription;

        public BucketViewHolder(@NonNull View itemView) {
            super(itemView);
            buckImage = itemView.findViewById(R.id.image_view_bucket_image);
            buckTitle = itemView.findViewById(R.id.text_view_bucket_title);
            buckDescription = itemView.findViewById(R.id.text_view_bucket_description);
        }

        public void bind(Bucket bucket){
            buckImage.setImageResource(bucket.getPicture());
            buckTitle.setText(bucket.getTitle());
            buckDescription.setText(bucket.getDescription());
        }
    }
}
