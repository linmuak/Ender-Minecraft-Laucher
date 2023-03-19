package org.eml.fox.files;


import org.eml.fox.Main;
import org.jetbrains.annotations.NotNull;

import java.io.*;
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
    public static void copy(@NotNull File source, File target) {
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


    public static void writeToProperties(String key , String value) {
        Properties properties = new Properties();
        try {
            FileOutputStream fos = new FileOutputStream(Main.USER_DIR+"\\user.properties", true);
            OutputStreamWriter opw = new OutputStreamWriter(fos, "utf-8");
            properties.setProperty(key, value);
            properties.store(opw , null);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
