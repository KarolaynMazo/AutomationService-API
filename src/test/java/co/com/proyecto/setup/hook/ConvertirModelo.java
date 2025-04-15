package co.com.proyecto.setup.hook;

import java.util.Map;

import co.com.proyecto.models.Informacion;
import io.cucumber.java.DataTableType;

public class ConvertirModelo {
    @DataTableType
    public Informacion convertir(Map<String,String> data){
        return Informacion.builder()
        .id(data.get("Id"))
        .title(data.get("Title"))
        .body(data.get("Body"))
        .build();
    }
}
