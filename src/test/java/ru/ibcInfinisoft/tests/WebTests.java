package ru.ibcInfinisoft.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Owner("Vladimir Evtushenko")
@DisplayName("Тест сайта ")
@Feature("DemoQA")
@Link(value = "Code of tests on GitHub ", url = "https://github.com/VEvtushenko/")

public class WebTests extends TestBase {

    @Tag("aboutCookies")
    @Description("Check link on cookies files description")
    @DisplayName("Cookies description test")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void aboutCookies() {
        $(".cookies-left").$(byLinkText("Узнать подробности")).click();
        $(".top").shouldHave(text("Сведения о сookies-файлах\n"));
    }
}
