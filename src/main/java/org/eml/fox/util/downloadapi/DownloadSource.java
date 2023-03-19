package org.eml.fox.util.downloadapi;

/**
 * @author liangcha_hh
 */
public class DownloadSource {
    public CommonApiProvider getdefaultApiProvider() {
        return defaultApiProvider;
    }
    public BMCLApiProvider getbmclApiProvider(){
        return bmclApiProvider;
    }

    public MCBBSApiProvider getmcbbsApiProvider(){
        return mcbbsApiProvider;
    }
    public static final CommonApiProvider defaultApiProvider = new CommonApiProvider();
    public static final BMCLApiProvider bmclApiProvider = new BMCLApiProvider();
    public static final MCBBSApiProvider mcbbsApiProvider = new MCBBSApiProvider();
}
