package com.certificacion.Serguei.app.questions.Siigo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.Serguei.app.userinterfaces.Siigo.LoginSiigoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginSiigo implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(TITLE_LOGIN_SIIGO, isVisible()).forNoMoreThan(20).seconds();
        return TITLE_LOGIN_SIIGO.resolveFor(actor).waitUntilEnabled().isVisible();
    }

    public static LoginSiigo isDisplayed() {
        return new LoginSiigo();
    }
}
