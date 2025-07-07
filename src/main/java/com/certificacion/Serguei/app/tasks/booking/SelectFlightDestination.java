package com.certificacion.Serguei.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.certificacion.Serguei.app.userinterfaces.FlightSearchPage.*;

public class SelectFlightDestination implements Task {


    public SelectFlightDestination() {

    }

    public static SelectFlightDestination fromTo() {
        return new SelectFlightDestination();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_DESTINATION_CITY),
                Click.on(SEARCH_FLIGHTS_BUTTON)
        );
    }
}
