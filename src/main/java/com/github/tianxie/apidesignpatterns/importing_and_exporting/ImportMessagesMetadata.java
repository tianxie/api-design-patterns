package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import lombok.Data;

@Data
public class ImportMessagesMetadata {
    private String chatRoom;
    private int messagesImported;
}
