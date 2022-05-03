package com.github.tianxie.apidesignpatterns.importing_and_exporting;

import lombok.Data;

@Data
public class SambaSource extends DataSource {
    private String uri;

    public SambaSource() {
        type = "samba";
    }
}
