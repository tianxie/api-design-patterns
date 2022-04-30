package com.github.tianxie.apidesignpatterns.pagination;

import lombok.Data;

@Data
public class ReadAttachmentRequest {
    private String id;
    private String pageToken;
    /**
     * 一块返回的最大字节数
     * 如果为空，使用一个默认值
     */
    private Integer maxBytes = 1024;
}
