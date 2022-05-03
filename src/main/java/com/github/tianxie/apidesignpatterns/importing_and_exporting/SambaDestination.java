package com.github.tianxie.apidesignpatterns.importing_and_exporting;

public class SambaDestination extends DataDestination {
    // The location of the Samba share (e.g., "smb://1.1.1.1:1234/path")
    private String uri;

    public SambaDestination() {
        type = "samba";
    }
}
