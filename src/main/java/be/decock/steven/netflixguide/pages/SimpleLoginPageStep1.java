package be.decock.steven.netflixguide.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleLoginPageStep1 {

    public static SimpleLoginPageStep1 openSimpleLoginPage() {
        open("https://www.netflix.com/be-en/Login");
        return new SimpleLoginPageStep1();
    }

    public SimpleLoginPageStep1 enterLogin(String login) {
        $("form.simple-login-form .ui-text-input").setValue(login);
        return this;
    }

    public SimpleLoginPageStep2 next() {
        loginButton().click();
        return new SimpleLoginPageStep2();
    }

    private SelenideElement loginButton() {
        return $("button.login-button");
    }
}
