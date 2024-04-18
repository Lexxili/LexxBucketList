package com.abraun.lexxbucketlist;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bucket_layout);

        RecyclerView thingsList = findViewById(R.id.recycler_view);
        Bucket[] buckets = {
                new Bucket(Bucket.BUCKET.THING, "Diving course", "Make a certificate for ocean diving.", R.drawable.diving),
                new Bucket(Bucket.BUCKET.THING, "Renovate the House", "Make new rooms, new floors and build in floor heating. Have a wintergarden.", R.drawable.renovate),
                new Bucket(Bucket.BUCKET.THING, "Have a second Dog", "Adding a Miniature Bull Terrier girl as a second dog to the family.", R.drawable.dog),
                new Bucket(Bucket.BUCKET.THING, "Have a Monstera GoG", "Own a beautiful Monstera plant with vibrant green foliage.", R.drawable.monstera),
                new Bucket(Bucket.BUCKET.THING, "Have vacation with the whole Family", "Enjoy a vacation in Egypt or another warm destination with my entire family.", R.drawable.vacation)
        };

        BucketAdapter adapter = new BucketAdapter(buckets);
        thingsList.setAdapter(adapter);
    }
}
