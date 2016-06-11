package be.decock.steven.netflixguide.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SimpleLoginPageStep2 {


    public SimpleLoginPageStep2 enterPassword(String password) {
        password().setValue(password);
        return this;
    }

    public ProfilesPage signIn() {
        signInButton().click();
        return new ProfilesPage();
    }

    private SelenideElement signInButton() {
        return $("button.btn-submit");
    }

    private SelenideElement password() {
        return $("form.simple-login-form input.ui-text-input");
    }
}
