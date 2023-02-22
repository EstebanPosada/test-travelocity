package com.travelocity.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import com.travelocity.task.SeleccionarHospedaje;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.travelocity.page.ResultadosBusquedaPage.LISTA_DE_RESULTADOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HospedajeStepDefinitions {

    @Cuando("{actor} busca un hospedaje para {string}")
    public void busca_un_hospedaje_para(Actor actor, String destino) {
        actor.attemptsTo(
                SeleccionarHospedaje.simple(destino)
        );
    }

    @Entonces("debe encontrar al menos una opcion disponible")
    public void debe_encontrar_al_menos_una_opcion_disponible() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(LISTA_DE_RESULTADOS, isVisible()).forNoMoreThan(Duration.ofSeconds(3))
        );
        Ensure.that(LISTA_DE_RESULTADOS).values().hasSizeGreaterThan(1);
    }
}
