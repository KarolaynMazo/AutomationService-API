package co.com.proyecto.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import co.com.proyecto.models.Informacion;
import co.com.proyecto.questions.ValidacionId;
import co.com.proyecto.questions.ValidacionIdActualizar;
import co.com.proyecto.enums.*;
import co.com.proyecto.exceptions.Exceptions;
import co.com.proyecto.interaction.SeleccionarMetodo;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.util.List;

import org.hamcrest.Matchers;

public class JsonPlaceStepDefinitions {

    @Dado("que se consume el api")
    public void queSeConsumeElApi() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(Constantes.BASE_URL.getValue()));
       
    }

    @Cuando("se determina el {string} para probar y se ingresan los datos correspondientes")
    public void seDeterminaElParaProbarYSeIngresanLosDatosCorrespondientes(String metodo,List<Informacion> data) {
        theActorInTheSpotlight().attemptsTo(SeleccionarMetodo.metodo(metodo, data.get(0)));
    }

    @Entonces("verifico el resultado del metodo {int}")
    public void verificoElResultadoDelMetodo(int id) {
        theActorInTheSpotlight().should(seeThatResponse(
            "El codigo exitoso", response -> response.statusCode(200)),
            seeThat(ValidacionId.response(), Matchers.is(id))
                    .orComplainWith(Exceptions.class,Mensaje.MSG_ERR_ID.getMensaje())); 
    }

    @Entonces("verifico el resultado del metodo y con el codigo {int} {int}")
    public void verificoElResultadoDelMetodoYConElCodigo(Integer codigo, Integer id) {
        theActorInTheSpotlight().should(seeThatResponse(
            "El codigo exitoso", response -> response.statusCode(codigo)),
            seeThat(ValidacionIdActualizar.response(), Matchers.is(id))
                    .orComplainWith(Exceptions.class,Mensaje.MSG_ERR_ID.getMensaje())); 
    }
    
    
 


}
