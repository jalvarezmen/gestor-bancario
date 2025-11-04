package com.banco.questions;

import com.banco.ui.Compra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ComprarQuestion implements Question<Boolean> {

    public static ComprarQuestion esExitosa() {
        return new ComprarQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Compra.MENSAJE_COMPRA_EXITOSA.resolveFor(actor).isVisible();
    }
}
