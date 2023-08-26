package com.saucedemo.testing.tasks;

import com.saucedemo.testing.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.actions.*;



import static com.saucedemo.testing.userinterfaces.HomePage.BTN_ADD;


public class BuyBookTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    HomePage.selectRandomBookAndSaveName(actor);

        actor.wasAbleTo(Click.on(BTN_ADD));


    }
    public static BuyBookTask buy() {
        return new BuyBookTask();
    }

}
