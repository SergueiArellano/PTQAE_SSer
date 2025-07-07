package com.certificacion.Serguei.app.tasks.Siigo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.certificacion.Serguei.app.userinterfaces.Siigo.LoginSiigoPage.EMAIL_FIELD_SIIGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectClientsInShadow implements Task {
    @Override
    @Step("{0} selecciona Crear → Clientes")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement shadowHost = driver.findElement(By.cssSelector("selector-shadow-host"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement botonCrear = shadowRoot.findElement(By.cssSelector("button.selector-crear"));
        botonCrear.click();
        WebElement opcionClientes = shadowRoot.findElement(By.cssSelector("a.selector-clientes"));
        opcionClientes.click();
    }

    public static Performable createClients() {
        return Tasks.instrumented(SelectClientsInShadow.class);
    }
}
