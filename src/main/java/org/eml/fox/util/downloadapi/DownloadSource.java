package org.eml.fox.util.downloadapi;

/**
 * @author liangcha_hh
 */
public class DownloadSource {
    private static final CommonApiProvider defaultApiProvider = new CommonApiProvider();
    private static final BMCLApiProvider bmclApiProvider = new BMCLApiProvider();
    private static final MCBBSApiProvider mcbbsApiProvider = new MCBBSApiProvider();
}
