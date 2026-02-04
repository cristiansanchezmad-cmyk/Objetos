package insti;

import lombok.*;

import java.util.Objects;

@Getter  @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor


public class insti {
    private String nombre


            ;
    private String poblacion;

    public void setNombre(String nombre){
        this.nombre = Objects.requireNonNullElse(nombre,"IES.Azpilicueta");
    }

}







