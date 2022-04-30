package com.github.tianxie.apidesignpatterns.pagination;

import lombok.Data;

@Data
public class ListChatRoomsRequest {
    private String pageToken;
    private int maxPageSize;
}
