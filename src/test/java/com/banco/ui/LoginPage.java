package com.banco.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("campo de usuario")
            .locatedBy("#user-name");
    public static final Target PASSWORD_FIELD = Target.the("campo de contraseña")
            .locatedBy("#password");
    public static final Target LOGIN_BUTTON = Target.the("botón de login")
            .locatedBy("#login-button");
}
