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
      | Metodo | Id | Codigo |
      | GET    |  2 |    200 |




