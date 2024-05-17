/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.certificacion.petStore.api.tasks;

import com.certificacion.petStore.api.helpers.EnvironmentProperties;
import com.certificacion.petStore.api.request.TemplatePetStore;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;
import net.thucydides.core.annotations.Step;

import static com.certificacion.petStore.api.helpers.Constant.*;

public class UpdatePet implements Task {




    public UpdatePet() {
    }

    public static Performable withId() {
        return Instrumented.instanceOf(UpdatePet.class).withProperties();
    }

    @Override
    @Step("{0} Ejecutar servicio")
    public <T extends Actor> void performAs(T actor) {
        Object object = TemplatePetStore.getRequestUpdatePet();
        actor.attemptsTo(
                Put.to(
                                EnvironmentProperties.getProperty(PET)
                        )
                        .with(request -> request
                                .header("Content-Type", HEADER_VALUE_CONTEN_TYPE)
                                .header("accept", HEADER_VALUE_ACCEPT)
                                .body(object))
        );
    }
}