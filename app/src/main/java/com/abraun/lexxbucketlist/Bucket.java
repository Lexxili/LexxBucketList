package com.abraun.lexxbucketlist;

public class Bucket {
    public enum BUCKET {THING, PLACE}

    BUCKET bucket;
    private String title;
    private String description;
    private int picture;

    public Bucket(BUCKET bucket, String title, String description, int picture) {
        this.bucket = bucket;
        this.title = title;
        this.description = description;
        this.picture = picture;
    }

    public BUCKET getBucket() {
        return bucket;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPicture() {
        return picture;
    }
}
