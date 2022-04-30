package com.github.tianxie.apidesignpatterns.pagination;

import lombok.Data;

@Data
public class ListChatRoomsResponse {
    private ChatRoom[] results;
    /**
     * 请求下一页时使用的标记。
     * 如果为空，表示是最后一页。
     * 一个Base64编码的UTF-8字符串
     */
    private String nextPageToken;
}
