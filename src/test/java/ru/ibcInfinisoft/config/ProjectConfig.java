package ru.ibcInfinisoft.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "classpath:config/local.properties",
        "classpath:config/remote.properties"
})

public interface ProjectConfig extends Config {

    @DefaultValue("chrome")
    String browser();
    @DefaultValue("106.0")
    String browserVersion();
    @DefaultValue("1920x1080")
    String browserSize();
    String remoteDriverUrl();
    @DefaultValue("https://https://ibs-infinisoft.ru")
    String webUrl();
    String videoStorage();
    String browserMobileView();
    String userPhone();
    String userPassword();
    String userName();
    String siteToken();
}
