package be.decock.steven.netflixguide.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class ProfilesPage {


    public BrowsePage chooseProfile(String profileName) {
        $$("span.profile-name").filter(text(profileName)).first().click();
        return new BrowsePage();
    }

}
