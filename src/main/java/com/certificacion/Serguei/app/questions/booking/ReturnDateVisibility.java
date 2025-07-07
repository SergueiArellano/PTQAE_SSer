package com.certificacion.Serguei.app.questions.booking;

import com.certificacion.Serguei.app.userinterfaces.FlightBookingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Visibility;


public class ReturnDateVisibility  implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(FlightBookingPage.RETURN_DATE_FIELD).answeredBy(actor) &&
                Enabled.of(FlightBookingPage.RETURN_DATE_FIELD).answeredBy(actor);
    }

    public static ReturnDateVisibility isAvailable() {
        return new ReturnDateVisibility();
    }
}
