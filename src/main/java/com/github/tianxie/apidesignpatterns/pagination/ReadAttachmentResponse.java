package com.github.tianxie.apidesignpatterns.pagination;

import lombok.Data;

@Data
public class ReadAttachmentResponse {
    /**
     * 资源的单个数据块
     */
    private Attachment chunk;
    /**
     * 当前块数据附加到资源的哪些字段
     */
    private FieldMask fieldMask;
    /**
     * 请求下一个资源块时使用的标记。
     * 如果为空，表示是最后一块。
     * 一个Base64编码的UTF-8字符串
     */
    private String nextPageToken;
}
