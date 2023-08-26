package com.saucedemo.testing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    //Objetivos o elementos con los que interactura la pagina
    // publico  para todo el proyecto, static final: porque puede que no cambie a traves del tiempo
    public static final Target TXT_USER_NAME = Target.the("INPUT USERNAME").located(By.id("userName"));
    public static final Target TXT_PASSWORD = Target.the("INPUT PASSWORD").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("BUTTON LOGIN").located(By.id("login"));
    public static final Target BTN_LOGOUT = Target.the("BUTTON LOGOUT").located(By.id("submit"));
}
