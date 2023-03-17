package org.eml.fox.util.downloadapi;

public class BMCLApiProvider implements DownloadApiProvider{
    public String versionManifest() {
        return "https://bmclapi2.bangbang93.com/mc/game/version_manifest.json";
    }

    public String versionClient() {
        return "https://bmclapi2.bangbang93.com/";
    }

    public String versionAssetsIndex() {
        return "https://bmclapi2.bangbang93.com/";
    }

    public String assets() {
        return "https://bmclapi2.bangbang93.com/assets/";
    }

    public String libraries() {
        return "https://bmclapi2.bangbang93.com/maven/";
    }

    public String versionJSON() {
        return "https://bmclapi2.bangbang93.com/";
    }

    public String authlibInjector() {
        return "https://bmclapi2.bangbang93.com/mirrors/authlib-injector/artifact/latest.json";
    }

    public String fabricMeta() {
        return "https://bmclapi2.bangbang93.com/fabric-meta/";
    }

    public String fabricMaven() {
        return "https://bmclapi2.bangbang93.com/maven/";
    }

    public String forgeMaven() {
        return "https://bmclapi2.bangbang93.com/maven/";
    }

    public String liteLoaderVersion() {
        return "https://bmclapi.bangbang93.com/maven/com/mumfrey/liteloader/versions.json";
    }
}
