package com.github.tianxie.apidesignpatterns.long_running_operations;

import lombok.Data;

@Data
class ListOperationsRequest {
    private String filter;
}
