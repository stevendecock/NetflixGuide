package be.decock.steven.netflixguide.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public static LoginPage openLoginPage() {
        open("https://www.netflix.com/be-en/Login");
        return new LoginPage();
    }

    public LoginPage enterEmail(String login) {
        emailField().setValue(login);
        return this;
    }

    private SelenideElement emailField() {
        return $("input.ui-text-input[name=\"email\"]");
    }

    public LoginPage enterPassword(String password) {
        if (signInButton().text().equals("Next")) {
            signInButton().click();
        }
        password().setValue(password);
        return this;
    }

    public ProfilesPage signIn() {
        signInButton().click();
        return new ProfilesPage();
    }

    private SelenideElement signInButton() {
        return $("button.btn-submit span");
    }

    private SelenideElement password() {
        return $("input.ui-text-input[name=\"password\"]");
    }

}
