package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import lombok.Data;

@Data
public class ImportMessagesResponse {
    private String chatRoom;
    private int messagesImported;
}
