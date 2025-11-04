package com.banco.stepdefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actions.Open;
import com.banco.tasks.LoginTask;
import com.banco.questions.ProductosPageQuestion;
import org.junit.Assert;
import net.serenitybdd.screenplay.Actor;


public class LoginStepDefinitions {

    @Dado("el usuario está en la página de login")
    public void elUsuarioEstaEnLaPaginaDeLogin() {
        Actor usuario = OnStage.theActorCalled("Usuario");
        usuario.attemptsTo(Open.url("https://www.saucedemo.com/"));
    }

    @Cuando("ingresa el usuario {string} y la contraseña {string}")
    public void ingresaElUsuarioYLaContraseña(String usuario, String contraseña) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            LoginTask.withCredentials(usuario, contraseña)
        );
    }

    @Entonces("el sistema muestra la página de productos")
    public void elSistemaMuestraLaPaginaDeProductos() {
        boolean estaEnProductos = OnStage.theActorInTheSpotlight().asksFor(ProductosPageQuestion.isVisible());
        Assert.assertTrue("No se mostró la página de productos", estaEnProductos);
    }
}