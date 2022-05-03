package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import lombok.Data;

@Data
public class ImportMessagesRequest {
    private String parent;
    private MessageInputConfig inputConfig;
    private DataSource dataSource;
}
