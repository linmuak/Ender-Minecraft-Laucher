package org.eml.fox.util.downloadapi;

/**
 * @author liangcha_hh
 */
public interface DownloadApiProvider {
    String versionManifest();

    String authlibInjector();

    String assets();

    String versionClient();

    String versionAssetsIndex();

    String libraries();

    String versionJSON();

    String fabricMeta();

    String fabricMaven();

    default String forge() {
        return "https://bmclapi2.bangbang93.com/forge/";
    }

    String forgeMaven();

    default String thirdPartyForge() {
        return "https://bmclapi2.bangbang93.com/forge/download";
    }

    String liteLoaderVersion();

    default String thirdPartyLiteLoaderDownload() {
        return "https://bmclapi2.bangbang93.com/liteloader/download";
    }

    default String thirdPartyOptiFine() {
        return "https://bmclapi2.bangbang93.com/optifine/";
    }

    default String quiltMeta() {
        return "https://meta.quiltmc.org/";
    }

    default String quiltMaven() {
        return "https://maven.quiltmc.org/repository/release/";
    }
}
