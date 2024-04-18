package com.abraun.lexxbucketlist;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bucket_layout);

        RecyclerView placesList = findViewById(R.id.recycler_view);
        Bucket[] buckets = {
                new Bucket(Bucket.BUCKET.PLACE, "Niagara Falls", "Great waterfalls in Canada.", R.drawable.niagara),
                new Bucket(Bucket.BUCKET.PLACE, "Netherlands", "A smal land at the coast, absent of mountains but abundant with friendly people.", R.drawable.netherlands),
                new Bucket(Bucket.BUCKET.PLACE, "Supertree Grove", "Big illuminated trees in Singapoore, with a walkaway through the canopies.", R.drawable.supertree),
        };

        BucketAdapter adapter = new BucketAdapter(buckets);
        placesList.setAdapter(adapter);
    }
}
