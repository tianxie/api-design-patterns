package com.github.tianxie.apidesignpatterns.long_running_operations;

import lombok.Data;

@Data
class ListOperationsResponse<ResultT, MetadataT> {
    private Operation<ResultT, MetadataT>[] results;
}
