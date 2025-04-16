package co.com.project.task;

import co.com.project.enums.Constants;
import co.com.project.interaction.Get;
import co.com.project.models.Information;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class GetConsult implements Task {
    private Information information;


    @Override
    public <T extends Actor> void performAs(T actor) {
   
        actor.attemptsTo(
               Get.resource(Constants.PATH_GET.getValue().concat(information.getId())).with(requestSpecification -> requestSpecification
               .relaxedHTTPSValidation()
               )
              // .param("id", information.getId()))
        );

    }

    public static GetConsult information(Information information) {
        return Tasks.instrumented(GetConsult.class, information);
    }
}
