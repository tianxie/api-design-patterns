package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import lombok.Data;

@Data
public class OperationError {
    private String code;
    private String message;
    private Object details;
}
