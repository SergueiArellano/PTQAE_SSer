package com.certificacion.Serguei.app.userinterfaces.Siigo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginSiigoPage {

    public static final Target TITLE_LOGIN_SIIGO = Target.the("Titulo Iniciar Sesión")
            .located(By.xpath("//h2[normalize-space()='Inicio de sesión']"));


    public static final Target EMAIL_FIELD_SIIGO = Target.the("Campo Correo Electrónico")
            .located(By.xpath("//input[@id='siigoSignInName']"));

    public static final Target CONTINUE_BUTTON_SIIGO = Target.the("Botón Continuar")
            .located(By.xpath("//button[@id='siigoNext']"));

    public static final Target PASSWORD_FIELD_SIIGO = Target.the("Campo Contraseña")
            .located(By.xpath("//input[@id='siigoPassword']"));

    public static final Target LOGIN_BUTTON_SII = Target.the("Login button")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target ERROR_MESSAGE_SII = Target.the("Login error message")
            .located(By.cssSelector(".bui-alert"));
}
