package org.eml.fox.files;


import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.PropertiesConfigurationLayout;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.eml.fox.Main;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Properties;

/**
 * @author 北瓜sakura
 * @date 2023/03/19
 * @since 1.0
 */
public class PropertiesUtils {
    /**
     * @return 用户当前目录
     */
    public static String getDir() {
        return System.getProperty("user.dir");
    }

    /**
     * @param source
     * @param target
     * @return
     */
    public static void copy(@NotNull File source, @NotNull File target) {
        if (target.exists())return;
        if (source.isFile()) {
            copyFile(source, target);
        } else {
            target = new File(target, source.getName());
            if (!target.exists()) {
                target.mkdirs();
            }
            File[] files = source.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    copyFile(files[i], target);
                }
            }
        }
    }

    /**
     * @param source
     * @param target 目标
     * @return
     * @description 复制文件
     */
    private static void copyFile(@NotNull File source, @NotNull File target) {
        if (!target.exists()) {
            target.mkdirs();
        }
        File targets = new File(target, source.getName());
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(targets);
            byte[] b = new byte[1024];
            int len = 0;
            System.out.println("Start copying......");
            while ((len = is.read(b)) != -1) {
                os.write(b, 0, len);
            }
            System.out.println("Done copying!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (Objects.nonNull(is)) is.close();
                if (Objects.nonNull(os)) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * @param key key
     * @param value value
     */
    public static void writeToProperties(String key , String value) {
        Properties properties = new Properties();
        try {
            FileOutputStream fos = new FileOutputStream(Main.USER_DIR+"\\user.properties", true);
            OutputStreamWriter opw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            properties.setProperty(key, value);
            properties.store(opw , null);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param propertiesName name
     * @param key key
     * @param value value
     */
    public static void updateProperties(String propertiesName,String key,String value){
        String path = getDir();
        String filePath = path + "\\" + propertiesName;
        File file = new File(filePath);
        PropertiesConfiguration configuration = new PropertiesConfiguration();
        PropertiesConfigurationLayout layout = configuration.getLayout();
        try {
            layout.load(configuration,new InputStreamReader(new FileInputStream(file)));
            configuration.setProperty(key,value);
            layout.save(configuration,new OutputStreamWriter(new FileOutputStream(file)));
        }catch (IOException | ConfigurationException e){
            e.printStackTrace();
        }
    }

    /**
     * @param propertiesSRCName p
     * @param key k
     * @param value v
     */
    public static void updateSRCProperties(String propertiesSRCName,String key,String value){
        File file = new File("src/main/resources/"+propertiesSRCName);
        PropertiesConfiguration configuration = new PropertiesConfiguration();
        PropertiesConfigurationLayout layout = configuration.getLayout();
        try {
            layout.load(configuration,new InputStreamReader(new FileInputStream(file)));
            configuration.setProperty(key,value);
            layout.save(configuration,new OutputStreamWriter(new FileOutputStream(file)));
        }catch (IOException | ConfigurationException e){
            e.printStackTrace();
        }
    }
}
