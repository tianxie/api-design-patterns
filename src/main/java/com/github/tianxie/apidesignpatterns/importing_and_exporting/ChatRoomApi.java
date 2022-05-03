package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import org.springframework.web.bind.annotation.PostMapping;

public class ChatRoomApi {
    @PostMapping("/{parent=chatRooms/*}/messages:export")
    public Operation<ExportMessagesResponse, ExportMessagesMetadata> exportMessages(ExportMessagesRequest req) {
        return null;
    }


    @PostMapping("/{parent=chatRooms/*}/messages:import")
    public Operation<ImportMessagesResponse, ImportMessagesMetadata> importMessages(ImportMessagesRequest req) {
        return null;
    }
}
