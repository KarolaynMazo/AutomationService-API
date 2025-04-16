package co.com.project.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;



@Data
@AllArgsConstructor
@Builder
public class Information {

    private String id;
    private String body;
    private String title;
    
}
