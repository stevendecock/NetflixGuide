package be.decock.steven.netflixguide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.util.stream.Collectors.toList;

public class BrowsePage {


    public BrowsePage clickBrowse() {
        browseButton().click();
        return this;
    }

    public List<String> getGenres() {
        genreNav().shouldBe(visible);
        return genreLinks().stream()
            .map(genreLink -> genreLink.text())
            .collect(toList());
    }

    private SelenideElement genreNav() {
        return $(".genreNav");
    }

    private ElementsCollection genreLinks() {
        return $$(".sub-menu-list a.sub-menu-link");
    }

    private SelenideElement browseButton() {
        return $("#hdPinTarget li.browse a");
    }

}
