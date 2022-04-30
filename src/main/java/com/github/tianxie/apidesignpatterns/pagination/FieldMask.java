package com.github.tianxie.apidesignpatterns.pagination;

import lombok.Data;

@Data
public class FieldMask {
    private String[] fields;
}
