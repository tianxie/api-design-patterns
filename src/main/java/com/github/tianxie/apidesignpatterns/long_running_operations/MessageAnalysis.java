package com.github.tianxie.apidesignpatterns.long_running_operations;

import lombok.Data;

import java.util.Map;

@Data
class MessageAnalysis {
    private String chatRoom;
    private int messageCount;
    private int participantCount;
    private Map<String, Integer> userGradeLevels;
}
