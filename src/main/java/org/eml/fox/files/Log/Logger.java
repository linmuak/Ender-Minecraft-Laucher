package org.eml.fox.files.Log;

import org.apache.logging.log4j.LogManager;
import org.jetbrains.annotations.TestOnly;

/**
 * @author 北瓜sakura
 * @date 2023.03.25
 * @since 1.0
 */
public class Logger {
    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger("logToFile");
    @TestOnly
    public static void main(String[] args) {

    }

}
