package co.com.project.setup.hook;

import java.util.Map;

import co.com.project.models.Information;
import io.cucumber.java.DataTableType;

public class ConvertModel {
    
    @DataTableType
    public Information convertir(Map<String,String> data){
        return Information.builder()
        .id(data.get("Id"))
        .title(data.get("Title"))
        .body(data.get("Body"))
        .build();
    }
}
