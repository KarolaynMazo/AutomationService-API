package co.com.proyecto.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.proyecto.stepdefinitions","co.com.proyecto.setup"},
        features = "src/test/resources/features/json_place_holder.feature",
        snippets = SnippetType.CAMELCASE
     //   tags = "@Segundo"
)

public class JsonPlaceHolder {

}
