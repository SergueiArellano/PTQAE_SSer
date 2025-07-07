package com.certificacion.Serguei.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.certificacion.Serguei.app.userinterfaces.CheckoutPage.*;

public class BookingSummary implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return SUMMARY_SECTION.resolveFor(actor).isVisible();
    }

    public static BookingSummary isDisplayed() {
        return new BookingSummary();
    }
}
