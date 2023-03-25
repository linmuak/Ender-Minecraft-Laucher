package org.eml.fox.files.Log;


import org.eml.fox.Main;
import org.eml.fox.files.PropertiesUtils;


import java.io.*;


/**
 * @author 北瓜sakura
 * @date 2023.03.21
 * @since 1.0
 */
public class LogUtils {
    /*public static void updateProperties(String key , String value){
        InputStream is = LogUtils.class.getClassLoader().getResourceAsStream("log4j.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void createDataDir() {
        String dir = Main.USER_DIR;
        File file = new File(dir + "\\EML");
        InputStream inputStream = null;
        if (!file.exists()) {
            file.mkdirs();
        }
       // File file1 = new File(dir+"\\EML\\Logs");
        //if (!file.exists()){
       //     file1.mkdirs();
        //}
        try {
            inputStream = new FileInputStream(dir + "\\user.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
        PropertiesUtils.updateProperties("user.properties","store_dir",dir+"\\EML");
    }

    public static void createLogsDir(){
        File file = new File(Main.USER_DIR+"\\EML\\Logs");
        if (!file.exists()){
            file.mkdirs();
        }
    }

    public static void init(){
        PropertiesUtils.updateSRCProperties("log4j.properties","log4j.appender.D.File",Main.USER_STORE+"\\Logs");
        PropertiesUtils.updateSRCProperties("log4j.properties","log4j.appender.E.File",Main.USER_STORE+"\\Logs");
        PropertiesUtils.updateSRCProperties("log4j.properties","log4j.appender.logToFile.File",Main.USER_STORE+"\\Logs");
    }
}
