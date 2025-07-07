package com.certificacion.Serguei.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class OrdenarPorPrecio implements Task {
    public static OrdenarPorPrecio menorAMayor() {
        return new OrdenarPorPrecio();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
