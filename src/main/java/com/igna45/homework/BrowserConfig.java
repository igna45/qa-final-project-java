package com.igna45.homework;

import static com.igna45.homework.BrowserType.CHROME;

public class BrowserConfig {

    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    public BrowserConfig(BrowserType browser, String version, boolean isHeadless){
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }
    public BrowserConfig(BrowserType browser, String version){
        this.browser = browser;
        this.version = version;
        this.isHeadless = false;
    }
    public BrowserConfig(BrowserType browser){
        this.browser = browser;
        this.version = "latest";
        this.isHeadless = false;
    }
    public static BrowserConfig createDefaultChromeConfig(){
        BrowserConfig config = new BrowserConfig(CHROME, "latest", true);
        return config;
    }
    public void AfiseazaConfig(){
        System.out.println("Browser: " + this.browser + ", Version: " + this.version + ", Headless: " + this.isHeadless);
    }
}
