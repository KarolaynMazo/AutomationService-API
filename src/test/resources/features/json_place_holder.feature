#Author: Karolayn.mazo@gmail.com
# language: es
Característica: Yo como analista de automatizacion
  requiero probar el CRUD de la API jsonplaceholder

  Esquema del escenario: Analista desea probar los metodos get relacionados al Api
    Dado que se consume el api
    Cuando se determina el "GET" para probar y se ingresan los datos correspondientes
      | Id   |
      | <Id> |
    Entonces verifico el resultado del metodo <Id>

    Ejemplos:
      | Id | Codigo |
      |  2 |    200 |

  @Segundo
  Esquema del escenario: Analista desea probar los metodo Post relacionados al Api
    Dado que se consume el api
    Cuando se determina el "POST" para probar y se ingresan los datos correspondientes
      | Title   | Body   |
      | <Title> | <Body> |
    Entonces verifico el resultado del metodo y con el codigo 201 <Id>

    Ejemplos:
      | Title     | Body                      | Id  |
      | New movie | New cinema and new movies | 101 |
      
@Segundo
  Escenario: Analista desea probar los metodo PATCH relacionados al Api
    Dado que se consume el api
    Cuando se determina el "PATCH" para probar y se ingresan los datos correspondientes
      | Id | Title |
      |  1 | Hola  |
  Entonces verifico el resultado del metodo y con el codigo 200 1

