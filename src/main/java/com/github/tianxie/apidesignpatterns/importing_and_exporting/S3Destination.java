package com.github.tianxie.apidesignpatterns.importing_and_exporting;

public class S3Destination extends DataDestination{
    private String bucketId;
    private String objectPrefix;

    public S3Destination() {
        type = "s3";
    }
}
