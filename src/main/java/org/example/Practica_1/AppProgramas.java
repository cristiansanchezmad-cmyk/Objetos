package org.example.Practica_1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppProgramas {


    static void main(String[] args) {

        LocalDate fechati=LocalDate.of(2005,12,25);
        //creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        //creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Director1");
        System.out.println(el_hormiguero);
        System.out.println(antena3);
        //insertamos empleados en el programa
        el_hormiguero.crearEmpleado("Pablo Motos","presentador",null);
        System.out.println(el_hormiguero);
        //ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());
        //insertamos invitados en el programa
        el_hormiguero.crearInvitado("Aitana","cantante",1,fechati );

        System.out.println(el_hormiguero.getListaInvitados());

//

//        Cadena caden1 = new Cadena("Cadena 3",fechati);
//        LocalDate fecha = LocalDate.of(2025, 7, 5);
//        LocalDate fecha2 = LocalDate.of(2024, 7, 5);
//        LocalDate fecha3 = LocalDate.of(2022, 6, 5);
//
//        Programa programa1 = new Programa("EL Hormiguero", caden1, 4, "Pepe",fecha);
//
//        System.out.println(programa1);
//
//        programa1.crearInvitado("Carlo", "Piloto", 4,fecha);
//        programa1.crearInvitado("Carlo", "Piloto",3,fecha2 );
//        programa1.crearInvitado("Carlo", "Piloto", 1, fecha3);
//caden1.añadirPrograma(programa1);
//
//        programa1.invitadosTemporada(4);
//
//programa1.vecesInvitado("Carlo");
//programa1.rastrearInvitado("Carlo");
//
//programa1.rastrearInvitado("Carlo");
//
//caden1.invitadoAntes("Carlo");
//
//programa1.buscarInvitado("Carlo");



    }


}