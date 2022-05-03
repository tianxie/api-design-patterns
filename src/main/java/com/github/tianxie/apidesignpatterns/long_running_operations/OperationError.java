package com.github.tianxie.apidesignpatterns.long_running_operations;

import lombok.Data;

@Data
public class OperationError {
    private String code;
    private String message;
    private Object details;
}
