package com.certificacion.Serguei.app.tasks.Siigo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.Serguei.app.model.UserCredentials.*;
import static com.certificacion.Serguei.app.userinterfaces.Siigo.LoginSiigoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    public Login() {
    }

    @Override
    @Step("Ingresar credenciales para iniciar Sesión.")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(EMAIL_FIELD_SIIGO, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(TEST_USER.getEmail()).into(EMAIL_FIELD_SIIGO),
                Enter.theValue(TEST_USER.getPassword()).into(PASSWORD_FIELD_SIIGO),
                Click.on(CONTINUE_BUTTON_SIIGO)
        );
    }

    public static Login withCredentials() {
        return new Login();
    }
}
