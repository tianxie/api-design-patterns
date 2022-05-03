package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import lombok.Data;

@Data
public class MessageOutputConfig {
    // 序列化的内容类型：json, csv, undefined
    private String contentType;

    // Use ${number} for a zero-padded file ID number.
    // Content type will be appended with file extension (e.g., ".json").
    // Default: "messages-part-${number}"
    private String filenameTemplate;

    private int maxFileSizeMb;

    // 压缩格式：bz2, zip, undefined
    private String compressionFormat;
}
