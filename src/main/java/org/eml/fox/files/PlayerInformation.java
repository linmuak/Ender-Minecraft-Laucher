package org.eml.fox.files;

import java.io.File;

public abstract class PlayerInformation {
    static File file = new File("config.json");
    public static void main(String[] args) {
        if (file.exists()){
        }
    }
}