package org.eml.fox.util.downloadapi;

public class CommonApiProvider implements DownloadApiProvider{
    public String versionManifest() {
        return "https://piston-meta.mojang.com/mc/game/version_manifest.json";
    }

    public String versionClient() {
        return "https://launcher.mojang.com/";
    }

    public String versionAssetsIndex() {
        return "https://piston-meta.mojang.com/";
    }

    public String assets() {
        return "https://resources.download.minecraft.net/";
    }

    public String libraries() {
        return "https://libraries.minecraft.net/";
    }

    public String versionJSON() {
        return "https://piston-meta.mojang.com/";
    }

    public String authlibInjector() {
        return "https://authlib-injector.yushi.moe/artifact/latest.json";
    }

    public String fabricMeta() {
        return "https://meta.fabricmc.net/";
    }

    public String fabricMaven() {
        return "https://maven.fabricmc.net/";
    }

    public String forgeMaven() {
        return "https://files.minecraftforge.net/maven/";
    }

    public String liteLoaderVersion() {
        return "http://dl.liteloader.com/versions/versions.json";
    }
}
