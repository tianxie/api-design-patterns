package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import lombok.Data;

@Data
public class Operation<ResultT, MetadataT> {
    private String id;
    private boolean done;
    private ResultT result;
    private MetadataT metadata;
    private OperationError error;
}
