package com.banco.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Compra {

    // === INVENTARIO / PRODUCTOS ===
    public static final Target PRODUCTO_1 = Target.the("primer producto (Sauce Labs Backpack)")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target PRODUCTO_2 = Target.the("segundo producto (Sauce Labs Bike Light)")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));

    public static final Target ICONO_CARRITO = Target.the("ícono del carrito de compras")
            .located(By.id("shopping_cart_container"));

    // === CARRITO ===
    public static final Target BTN_CHECKOUT = Target.the("botón de checkout")
            .located(By.id("checkout"));

    // === INFORMACIÓN DE ENVÍO ===
    public static final Target INPUT_NOMBRE = Target.the("campo de primer nombre")
            .located(By.id("first-name"));

    public static final Target INPUT_APELLIDO = Target.the("campo de apellido")
            .located(By.id("last-name"));

    public static final Target INPUT_CODIGO_POSTAL = Target.the("campo de código postal")
            .located(By.id("postal-code"));

    public static final Target BTN_CONTINUE = Target.the("botón para continuar con la compra")
            .located(By.id("continue"));

    // === RESUMEN Y FINALIZAR ===
    public static final Target BTN_FINISH = Target.the("botón para finalizar la compra")
            .located(By.id("finish"));

    public static final Target MENSAJE_COMPRA_EXITOSA = Target.the("mensaje de confirmación de compra")
            .located(By.xpath("//h2[contains(text(), 'Thank you for your order!')]"));

}
