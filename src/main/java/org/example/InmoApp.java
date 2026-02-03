package org.example;

public class InmoApp {
    public static void main(String[] args){

        Casa pisito=new Casa("Calle False 123");
        Habitacion desvan = new Habitacion("desván",29);

        pisito.getPropietario();

        pisito.crearHabitacion("cocina", 20);
        pisito.crearHabitacion("baño",17);
        pisito.crearHabitacion("dormitorio",21);
        pisito.crearHabitacion("dormitorio",12);



        System.out.println(pisito.getListaHabitaciones());

        pisito.MostrarHabitaciones();

        System.out.println("La habitación más grande es "+pisito.getHabitacionmasGrande().getNombre());

        pisito.eliminarHabitaciones("baño");
        pisito.eliminarHabitaciones("baño");

        pisito.MostrarHabitaciones();

       desvan.agregarElectrodomestico("lavadora",54);
       desvan.mostrasElectrodomestico();
       pisito.getListaHabitaciones().get(0).agregarElectrodomestico("lavadora",23);
       pisito.getListaHabitaciones().get(0).mostrasElectrodomestico();
       pisito.gethabitacionConsumo();
    }
}
