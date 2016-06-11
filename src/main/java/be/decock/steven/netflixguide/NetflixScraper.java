package be.decock.steven.netflixguide;

import com.codeborne.selenide.Configuration;

import java.util.List;

import static be.decock.steven.netflixguide.pages.LoginPage.openLoginPage;
import static java.util.stream.Collectors.joining;

public class NetflixScraper {

    public static void main(String[] args) {
        String login = args[0];
        String password = args[1];
        Configuration.browser = "phantomjs";
        List<String> genres = openLoginPage()
                .enterEmail(login)
                .enterPassword(password)
                .signIn()
                .chooseProfile("Steven")
                .clickBrowse()
                .getGenres();

        System.out.println(genres.stream().collect(joining(",")));

    }
}
