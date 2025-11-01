package com.igna45.homework;

import static com.igna45.homework.BrowserType.*;

public class TestConfigRunner {
    public static void main(String[] args){

        BrowserConfig browser1 = new BrowserConfig(FIREFOX, "2.3", true);
        BrowserConfig browser2 = new BrowserConfig(EDGE, "1.9");
        BrowserConfig browser3 = new BrowserConfig(CHROME);

        BrowserConfig browser4 = BrowserConfig.createDefaultChromeConfig();

        browser1.AfiseazaConfig();
        browser2.AfiseazaConfig();
        browser3.AfiseazaConfig();
        browser4.AfiseazaConfig();
    }
}
