package com.certificacion.Serguei.stepDefinitions.Siigo;

import com.certificacion.Serguei.app.questions.Siigo.CurrentUrlIs;
import com.certificacion.Serguei.app.questions.Siigo.LoginSiigo;
import com.certificacion.Serguei.app.questions.booking.HomePage;
import com.certificacion.Serguei.app.questions.booking.LoginSuccess;
import com.certificacion.Serguei.app.tasks.Siigo.Login;
import com.certificacion.Serguei.app.tasks.Siigo.SelectClientsInShadow;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.certificacion.Serguei.app.util.Constant.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.junit.Assert.assertTrue;

public class SiigoLoginStepDefinitions {

    private static final String ACTOR_NAME = "User";


    @Dado("que el usuario abre la plataforma Siigo")
    public void queElUsuarioAbreLaPlataformaSiigo() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME)
                .wasAbleTo(Open.url(URL_SIIGO));
        assertTrue(
                theActorInTheSpotlight()
                        .asksFor(
                                LoginSiigo.isDisplayed()
                        )
        );
    }

    @Cuando("el usuario ingresa credenciales correo y contraseña correcta en el login")
    public void elUsuarioIngresaCredencialesCorrectaEnElLogin() {
        theActorInTheSpotlight()
                .attemptsTo(
                        Login.withCredentials()
                );
    }

    @Entonces("debe ser redirigido al panel principal de la aplicación")
    public void debeSerRedirigidoAlPanelPrincipal() throws InterruptedException {
        Thread.sleep(12000);
        assertTrue(
                theActorInTheSpotlight()
                        .asksFor(
                                CurrentUrlIs.equalTo(URL_SIIGO_HOME)
                        )
        );
    }
}
