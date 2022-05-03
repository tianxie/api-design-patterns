package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import lombok.Data;

@Data
public class MessageInputConfig {
    // 输入的内容类型：json, csv, undefined
    private String contentType;

    // 压缩格式：bz2, zip, undefined
    private String compressionFormat;
}
