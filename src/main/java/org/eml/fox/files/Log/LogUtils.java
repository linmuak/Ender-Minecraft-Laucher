package org.eml.fox.files.Log;

import org.eml.fox.Main;

import java.io.*;
import java.util.Properties;

/**
 * @author 北瓜sakura
 * @date 2023.03.21
 * @since 1.0
 */
public class LogUtils {
    public static void updateProperties(String key , String value){
        InputStream is = LogUtils.class.getClassLoader().getResourceAsStream("log4j.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static void createDir() {
        String dir = Main.USER_DIR;
        File file = new File(dir + "\\EML");
        InputStream inputStream = null;
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            inputStream = new FileInputStream(dir + "\\user.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
