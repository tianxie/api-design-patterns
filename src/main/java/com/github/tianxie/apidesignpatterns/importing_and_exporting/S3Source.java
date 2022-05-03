package com.github.tianxie.apidesignpatterns.importing_and_exporting;

public class S3Source extends DataSource {
    private String bucketId;
    // One or more masks in glob format (e.g., "folder/messages.*.csv")
    private String[] mask;

    public S3Source() {
        type = "s3";
    }
}
