package com.travelocity.page;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPrincipalPage {
    public static Target HOSPEDAJE_DESTINO = Target.the("busqueda destino de hospedaje").locatedBy("//button[@data-stid=\"location-field-destination-menu-trigger\"]");
    public static Target HOSPEDAJE_DESTINO_BUSQUEDA = Target.the("busqueda input destino de hospedaje").locatedBy("//input[@id=\"location-field-destination\"]");
    public static Target HOSPEDAJE_FECHA_IN = Target.the("boton fecha in").locatedBy("//button[@id=\"d1-btn\"]");
    public static Target HOSPEDAJE_FECHA_1 = Target.the("fecha in seleccion").locatedBy("//button[@aria-label=\"Apr 5, 2023\"]");
//    public static Target HOSPEDAJE_FECHA_1 = Target.the("fecha in seleccion").locatedBy("//div[@data-stid="date-picker-month"]//button[@data-day="5"]");
    public static Target HOSPEDAJE_FECHA_2 = Target.the("fecha out destino").locatedBy("//button[@aria-label=\"Apr 15, 2023\"]");
//    public static Target HOSPEDAJE_FECHA_2 = Target.the("fecha out destino").locatedBy("//button[@id=\"d2-btn\"]");
    public static Target HOSPEDAJE_FECHAS_LISTO = Target.the("busqueda input destino").locatedBy("//button[@data-stid=\"apply-date-picker\"]");
    public static Target HOSPEDAJE_BUSCAR = Target.the("boton hospedje buscar").locatedBy("//button[@data-testid=\"submit-button\"]");
}
