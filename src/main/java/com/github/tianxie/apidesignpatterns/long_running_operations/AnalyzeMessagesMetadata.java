package com.github.tianxie.apidesignpatterns.long_running_operations;

import lombok.Data;

@Data
class AnalyzeMessagesMetadata {
    private String chatRoom;
    private boolean paused; // 用于暂停和恢复操作
    private int messagesProcessed;
    private int messagesCounted;
}
