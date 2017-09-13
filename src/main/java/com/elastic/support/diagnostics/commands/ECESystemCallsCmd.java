package com.elastic.support.diagnostics.commands;

import com.elastic.support.util.SystemProperties;

public class ECESystemCallsCmd extends SystemCallsCmd {

    @Override
    public String checkOS() {
        String osName = SystemProperties.osName.toLowerCase();

        if (osName.contains("linux")) {
            return "ECELinuxOS";
        } else {
            logger.error("Failed to detect ECE operating system!");
            throw new RuntimeException("Unsupported ECE OS");
        }
    }
}
