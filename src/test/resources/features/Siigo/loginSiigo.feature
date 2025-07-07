#language:es

@SiigoAll
Característica: Autenticación de usuario en la plataforma SIIGO

  @SiigoLogin
  Escenario: Login exitoso con credenciales válidas
    Dado que el usuario abre la plataforma Siigo
    Cuando el usuario ingresa credenciales correo y contraseña correcta en el login
    Entonces debe ser redirigido al panel principal de la aplicación

