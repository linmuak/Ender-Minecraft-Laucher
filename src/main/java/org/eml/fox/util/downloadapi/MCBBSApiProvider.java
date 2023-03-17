package org.eml.fox.util.downloadapi;

/**
 * @author liangcha_hh
 */
public class MCBBSApiProvider implements DownloadApiProvider{
    public String versionManifest() {
        return "https://download.mcbbs.net/mc/game/version_manifest.json";
    }

    public String versionClient() {
        return "https://download.mcbbs.net/";
    }

    public String versionAssetsIndex() {
        return "https://download.mcbbs.net/";
    }

    public String assets() {
        return "https://download.mcbbs.net/assets/";
    }

    public String libraries() {
        return "https://download.mcbbs.net/maven/";
    }

    public String versionJSON() {
        return "https://download.mcbbs.net/";
    }

    public String authlibInjector() {
        return "https://download.mcbbs.net/mirrors/authlib-injector/artifact/latest.json";
    }

    public String fabricMeta() {
        return "https://download.mcbbs.net/fabric-meta/";
    }

    public String fabricMaven() {
        return "https://download.mcbbs.net/maven/";
    }

    public String forge() {
        return "https://download.mcbbs.net/forge/";
    }

    public String forgeMaven() {
        return "https://download.mcbbs.net/maven/";
    }

    public String thirdPartyForge() {
        return "https://download.mcbbs.net/forge/download";
    }

    public String liteLoaderVersion() {
        return "https://download.mcbbs.net/maven/com/mumfrey/liteloader/versions.json";
    }

    public String thirdPartyLiteLoaderDownload() {
        return "https://download.mcbbs.net/liteloader/download";
    }

    public String thirdPartyOptiFine() {
        return "https://download.mcbbs.net/optifine/";
    }
}
