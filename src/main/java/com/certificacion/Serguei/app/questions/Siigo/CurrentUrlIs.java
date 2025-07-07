package com.certificacion.Serguei.app.questions.Siigo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.Serguei.app.userinterfaces.Siigo.LoginSiigoPage.TITLE_LOGIN_SIIGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CurrentUrlIs implements Question<Boolean> {

    private final String expectedUrl;

    public CurrentUrlIs(String expectedUrl) {
        this.expectedUrl = expectedUrl;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actualUrl = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
        WaitUntil.the(actualUrl, isVisible()).forNoMoreThan(30).seconds();
        return actualUrl.equals(expectedUrl);
    }

    public static CurrentUrlIs equalTo(String expectedUrl) {
        return new CurrentUrlIs(expectedUrl);
    }
}
