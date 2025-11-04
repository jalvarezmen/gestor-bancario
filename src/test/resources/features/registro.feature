Feature: Login de usuario

  Scenario: Login exitoso con credenciales válidas
    Given el usuario está en la página de login
    When ingresa el usuario "standard_user" y la contraseña "secret_sauce"
    Then el sistema muestra la página de productos

  Scenario: Comprar productos exitosamente
    Given el usuario está en la página de registro
    When ingresa los datos requeridos y envía el formulario
    Then el sistema muestra un mensaje de registro exitoso
