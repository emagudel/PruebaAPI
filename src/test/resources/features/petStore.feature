#language:es

@Pet
Característica: Api Pet Store localhost:8080
  Yo como usuario del portal Pet Store
  Quiero ejecutar los servicios del portal
  Para agregar, consultar y actualizar mascotas del portal

  @Pet @NewPet
  Escenario: Agregar nueva mascota (Post)
    Dado que Erik tiene los datos para ejecutar el servicio
    Cuando se ejecuta el servicio
    Entonces el servicio responder de manera exitosa

  @Pet @FindPetForID
  Esquema del escenario: Buscar mascota por ID ingresado (Get)
    Dado que Erik tiene los datos para ejecutar el servicio
    Cuando se ejecuta la busqueda de ID <id> en servicio rest
    Entonces el servicio responder de manera exitosa

    Ejemplos:
      | id |
      | 10 |

  @Pet @UpdatePet
  Escenario: Actualizar mascota (Update)
    Dado que Erik tiene los datos para ejecutar el servicio
    Cuando se ejecuta la actualizacion de la mascota
    Entonces el servicio responder de manera exitosa

