package com.banco.stepdefinitions;

import com.banco.tasks.LoginTask;
import com.banco.tasks.RealizarCompraTask;
import com.banco.ui.Compra;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;

public class CompraStepDefinitions {

    @Dado("el usuario está en la página de registro")
    public void elUsuarioEstaEnLaPaginaDeRegistro() {
        OnStage.theActorCalled("Usuario").attemptsTo(
            Open.url("https://www.saucedemo.com/"),
            LoginTask.withCredentials("standard_user", "secret_sauce")
        );
    }

    @Cuando("ingresa los datos requeridos y envía el formulario")
    public void ingresaLosDatosYEnviaElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            RealizarCompraTask.desdeElInventario()
        );
    }

    @Entonces("el sistema muestra un mensaje de registro exitoso")
    public void elSistemaMuestraUnMensajeDeRegistroExitoso() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Ensure.that(Compra.MENSAJE_COMPRA_EXITOSA).isDisplayed()
        );
    }
}
