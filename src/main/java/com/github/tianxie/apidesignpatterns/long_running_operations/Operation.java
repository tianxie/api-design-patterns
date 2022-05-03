package com.github.tianxie.apidesignpatterns.long_running_operations;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Operation<ResultT, MetadataT> {
    private String id;
    private boolean done;
    private ZonedDateTime expireTime; // Operation资源何时从系统删除
    private ResultT result;
    private MetadataT metadata;
    private OperationError error;
}
