package com.banco.tasks;

import com.banco.ui.Compra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.annotations.Step;

public class RealizarCompraTask implements Task {

    @Override
    @Step("{0} realiza una compra desde el inventario")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Agregar productos al carrito
                Click.on(Compra.PRODUCTO_1),
                Click.on(Compra.PRODUCTO_2),
                Click.on(Compra.ICONO_CARRITO),

                // Ir al checkout
                Click.on(Compra.BTN_CHECKOUT),

                // Completar formulario
                Enter.theValue("Julián").into(Compra.INPUT_NOMBRE),
                Enter.theValue("Álvarez").into(Compra.INPUT_APELLIDO),
                Enter.theValue("170001").into(Compra.INPUT_CODIGO_POSTAL),
                Click.on(Compra.BTN_CONTINUE),

                // Finalizar compra
                Click.on(Compra.BTN_FINISH)
        );
    }

    public static RealizarCompraTask desdeElInventario() {
        return new RealizarCompraTask();
    }
}
