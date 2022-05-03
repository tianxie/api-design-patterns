package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import lombok.Data;

@Data
public class ExportMessagesRequest {
    private String parent;
    private MessageOutputConfig outputConfig;
    private DataDestination dataDestination;
    private String filter;
}
