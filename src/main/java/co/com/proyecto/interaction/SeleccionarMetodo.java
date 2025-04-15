package co.com.proyecto.interaction;

import co.com.proyecto.models.Informacion;
import co.com.proyecto.task.Actualizar;
import co.com.proyecto.task.Consultar;
import co.com.proyecto.task.Crear;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

@AllArgsConstructor

public class SeleccionarMetodo implements Interaction {

    String metodo;
    Informacion informacion;

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (metodo) {
            case "GET":
                actor.attemptsTo(
                        Consultar.informacion(informacion));
                break;
            case "POST":
                actor.attemptsTo(
                        Crear.informacion(informacion));
                break;
            case "PATCH":
                actor.attemptsTo(
                        Actualizar.informacion(informacion));
                break;

            default:
                break;
        }

    }

    public static SeleccionarMetodo metodo(String metodo, Informacion informacion) {
        return new SeleccionarMetodo(metodo, informacion);
    }

}