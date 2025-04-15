package co.com.proyecto.task;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.proyecto.enums.Constantes;
import co.com.proyecto.interaction.Get;
import co.com.proyecto.models.Informacion;

@AllArgsConstructor
public class Consultar implements Task {
    private Informacion informacion;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               Get.resource(Constantes.PATH_GET.getValue().concat(informacion.getId())).with(requestSpecification -> requestSpecification
               .relaxedHTTPSValidation()
               )
              // .param("id", informacion.getId()))
        );

    }

    public static Consultar informacion(Informacion informacion) {
        return Tasks.instrumented(Consultar.class, informacion);
    }
}
