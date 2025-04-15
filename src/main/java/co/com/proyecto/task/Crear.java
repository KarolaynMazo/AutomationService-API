package co.com.proyecto.task;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.proyecto.enums.Constantes;

import co.com.proyecto.interaction.Post;
import co.com.proyecto.models.Informacion;

@AllArgsConstructor
public class Crear implements Task {
    private Informacion informacion;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(Constantes.PATH_POST.getValue()).with(requestSpecification -> requestSpecification
                .relaxedHTTPSValidation()
                .body(informacion))
               
             
        );

    }

    public static Crear informacion(Informacion informacion) {
        return Tasks.instrumented(Crear.class, informacion);
    }
}
