package ru.ibcInfinisoft.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.ibcInfinisoft.config.Driver;
import ru.ibcInfinisoft.driver.DriverSettings;
import ru.ibcInfinisoft.driver.DriverUtils;
import ru.ibcInfinisoft.helpers.AllureAttachments;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
        Configuration.holdBrowserOpen = true;
        open("/");
    }

    @AfterAll
    static void addAttachments() {
        String sessionId = DriverUtils.getSessionId();
        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
        AllureAttachments.addBrowserConsoleLogs();
//        if (Driver.isVideoOn()) {
//            AllureAttachments.addVideo(sessionId);
//        }
        Selenide.closeWebDriver();
    }
}
