package com.banco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosPageQuestion implements Question<Boolean> {
    private static final Target PRODUCTOS_TITLE = Target.the("título de productos")
            .locatedBy(".title");

    public static ProductosPageQuestion isVisible() {
        return new ProductosPageQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return PRODUCTOS_TITLE.resolveFor(actor).isVisible();
    }
}