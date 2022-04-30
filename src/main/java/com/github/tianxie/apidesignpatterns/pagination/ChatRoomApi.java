package com.github.tianxie.apidesignpatterns.pagination;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ChatRoomApi {

    /**
     * 分页读取资源集合
     *
     * @param req
     * @return
     */
    @GetMapping("/chatRooms")
    public ListChatRoomsResponse listChatRooms(ListChatRoomsRequest req) {
        return null;
    }

    /**
     * 分块读取单个资源
     *
     * @param req
     * @return
     */
    @GetMapping("/{id=chatRooms/*/messages/*/attachments/*}:read")
    public ReadAttachmentResponse readAttachment(ReadAttachmentRequest req) {
        return null;
    }
}
