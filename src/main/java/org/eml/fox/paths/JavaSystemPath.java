package org.eml.fox.paths;

import org.eml.fox.downloadFiles.MinecraftJar;

public class JavaSystemPath {
    String javapath = System.getProperty("java.home")+"/bin/java";

    public void main(String[] args) {
        //ProcessBuilder processbuilder = new ProcessBuilder(javapath,"-jar", MinecraftJar);
    }

}
