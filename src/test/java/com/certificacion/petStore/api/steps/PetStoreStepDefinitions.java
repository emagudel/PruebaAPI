package com.certificacion.petStore.api.steps;

import com.certificacion.petStore.api.helpers.DTO;
import com.certificacion.petStore.api.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.certificacion.petStore.api.helpers.Constant.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PetStoreStepDefinitions {

    private DTO dto = new DTO();

    @Dado("que {} tiene los datos para ejecutar el servicio")
    public void tieneLosDatosDelServicioQueAgregaUnaNuevaMascota(String actor) {
        OnStage.
                setTheStage(
                        new OnlineCast()
                );
        theActorCalled(actor)
                .whoCan(
                        CallAnApi.at(BASE_URL_PET_STORE)
                );
    }

    @Cuando("se ejecuta el servicio")
    public void seEjecutaElServicio() {
        theActorInTheSpotlight()
                .attemptsTo(
                        AddNewPet.withId()
                );
    }

    @Entonces("el servicio responder de manera exitosa")
    public void elServicioResponderDeManeraExitosa() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCOk.without()
                );
    }

    @Entonces("el servicio responder de manera fallida")
    public void elServicioResponderDeManeraFallida() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ValidateSCOkFail.without()
                );
    }

    @Cuando("se ejecuta la busqueda de ID {} en servicio rest")
    public void seEjecutaLaBusquedaDeIDIdElServicioRest(String id) {
        theActorInTheSpotlight()
                .attemptsTo(
                        FindPetForID.withId(id)
                );
    }

    @Cuando("se ejecuta la actualizacion de la mascota")
    public void seEjecutaLaActualizacionDeLaMascota() {
        theActorInTheSpotlight()
                .attemptsTo(
                        UpdatePet.withId()
                );
    }
}
