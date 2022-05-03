package com.github.tianxie.apidesignpatterns.long_running_operations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ChatRoomApi {
    @PostMapping("/chatRooms")
    public Operation<ChatRoom, CreateChatRoomMetadata> createChatRoom(CreateChatRoomRequest req) {
        return null;
    }

    /**
     * 用于客户端轮询
     *
     * @param req
     * @param <ResultT>
     * @param <MetadataT>
     * @return
     */
    @GetMapping("/{id=operations/*}")
    public <ResultT, MetadataT> Operation<ResultT, MetadataT> getOperation(GetOperationRequest req) {
        return null;
    }

    /**
     * 用于客户端阻塞
     *
     * @param req
     * @param <ResultT>
     * @param <MetadataT>
     * @return
     */
    @GetMapping("/{id=operations/*}:wait")
    public <ResultT, MetadataT> Operation<ResultT, MetadataT> waitOperation(WaitOperationRequest req) {
        return null;
    }

    /**
     * 监测进度
     *
     * @param req
     * @return
     */
    @PostMapping("/{parent=chatRooms/*}/messages:analyze")
    public Operation<MessageAnalysis, AnalyzeMessagesMetadata> analyzeMessages(AnalyzeMessagesRequest req) {
        return null;
    }

    /**
     * 取消操作
     *
     * @param req
     * @param <ResultT>
     * @param <MetadataT>
     * @return
     */
    @PostMapping("/{id=operations/*}:cancel")
    public <ResultT, MetadataT> Operation<ResultT, MetadataT> cancelOperation(CancelOperationRequest req) {
        return null;
    }

    /**
     * 暂停操作
     *
     * @param req
     * @param <ResultT>
     * @param <MetadataT>
     * @return
     */
    @PostMapping("/{id=operations/*}:pause")
    public <ResultT, MetadataT> Operation<ResultT, MetadataT> pauseOperation(PauseOperationRequest req) {
        return null;
    }

    /**
     * 恢复操作
     *
     * @param req
     * @param <ResultT>
     * @param <MetadataT>
     * @return
     */
    @PostMapping("/{id=operations/*}:resume")
    public <ResultT, MetadataT> Operation<ResultT, MetadataT> resumeOperation(ResumeOperationRequest req) {
        return null;
    }

    @GetMapping("/operations")
    public <ResultT, MetadataT> ListOperationsResponse<ResultT, MetadataT> listOperations(ListOperationsRequest req) {
        return null;
    }
}
