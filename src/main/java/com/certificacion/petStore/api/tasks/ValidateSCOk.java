package com.certificacion.petStore.api.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import org.apache.http.HttpStatus;

public class ValidateSCOk implements Task {

    public ValidateSCOk() {

    }

    public static Performable without() {
        return Instrumented.instanceOf(ValidateSCOk.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Ensure.that("status code del response es 200", response -> response.statusCode(HttpStatus.SC_OK))
        );
    }
}
