package com.certificacion.Serguei.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.certificacion.Serguei.app.userinterfaces.BookingHomePage.*;

public class BuscarHotelDetails implements Task {

    private final String ciudad;

    public BuscarHotelDetails(String ciudad) {
        this.ciudad = ciudad;
    }

    public static BuscarHotelDetails en(String ciudad) {
        return new BuscarHotelDetails(ciudad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ciudad).into(INPUT_DESTINATION),
                Click.on(SEARCH_BUTTON)
        );
    }
}
