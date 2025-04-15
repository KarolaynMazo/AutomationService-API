package co.com.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;



@Data
@AllArgsConstructor
@Builder
public class Informacion {

    private String id;
    private String body;
    private String title;
    
}
