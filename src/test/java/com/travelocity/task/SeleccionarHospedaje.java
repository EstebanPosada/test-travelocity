package com.travelocity.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.travelocity.page.BusquedaPrincipalPage.*;

public class SeleccionarHospedaje {

    public static Performable simple(String destino) {
        return Task.where("{0} selecciona un hospedaje 'simple' para '" + destino + "'",
                Open.url("https://www.travelocity.com/"),
                Click.on(HOSPEDAJE_DESTINO),
                Enter.theValue(destino).into(HOSPEDAJE_DESTINO_BUSQUEDA).thenHit(Keys.ENTER),
                Click.on(HOSPEDAJE_FECHA_IN),
                Click.on(HOSPEDAJE_FECHA_1),
                Click.on(HOSPEDAJE_FECHA_2),
                Click.on(HOSPEDAJE_FECHAS_LISTO),
                Click.on(HOSPEDAJE_BUSCAR)

        );
    }
}
