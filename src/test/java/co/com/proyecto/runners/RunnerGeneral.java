package co.com.proyecto.runners;

import net.serenitybdd.cucumber.cli.Main;

public class RunnerGeneral {
    public static void main(String[] args) throws Throwable {
        Main.main(new String[]{"-g", "co.com.proyecto.stepdefinitions",
        "-g", "co.com.proyecto.setup",
         "src/test/resources/features/json_place_holder.feature"});        
    }
}
