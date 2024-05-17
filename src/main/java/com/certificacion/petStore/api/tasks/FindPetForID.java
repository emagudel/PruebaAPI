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
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;

import static com.certificacion.petStore.api.helpers.Constant.*;

public class FindPetForID implements Task {

    private String id;

    public FindPetForID(String id) {
        this.id = id;
    }

    public static Performable withId(String id) {
        return Instrumented.instanceOf(FindPetForID.class).withProperties(id);
    }

    @Override
    @Step("{0} Ejecutar servicio")
    public <T extends Actor> void performAs(T actor) {
        String endpoint = EnvironmentProperties.getProperty(PET_ID);
        actor.attemptsTo(
                Get.resource(
                        endpoint + id
                )
        );
    }
}