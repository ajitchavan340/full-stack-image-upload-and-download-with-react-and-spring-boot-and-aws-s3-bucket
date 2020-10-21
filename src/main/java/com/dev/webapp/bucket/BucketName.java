package com.dev.webapp.bucket;

public enum BucketName {

    PROFILE_IMAGE("dev-image-upload-with-spring-boot");

    public final  String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
