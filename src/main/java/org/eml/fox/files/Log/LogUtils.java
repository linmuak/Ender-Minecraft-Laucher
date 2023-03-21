package org.eml.fox.files.Log;

import java.io.InputStream;

/**
 * @author 北瓜sakura
 * @date 2023.03.21
 * @since 1.0
 */
public class LogUtils {
    public static void updateProperties(String key , String value){
        InputStream is = LogUtils.class.getClassLoader().getResourceAsStream("src/log4j.properties");
    }
}
