package org.example.Practica_1;

import java.util.Arrays;
import java.util.List;

public class Empleado {



    private static final String GenerarID="EP";
    private static int ContadorID=1;
    private String nombre;
    private String cargo;
    private Empleado director;
    private String id;

    public Empleado(String nombre, String cargo, Empleado empleado){

        this.nombre=nombre;
        setCargo(cargo);
        if (this.cargo.equals("director")){
            this.director=null;
        }
        setId();
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id=GenerarID+ContadorID++;

    }
    public static int getContadorID() {
        return ContadorID;
    }

    public static void setContadorID(int contadorID) {
        ContadorID = contadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        List<String> cargosValidos= Arrays.asList(

                "director", "técnico", "presentador", "colaborador"

        );

        if (cargosValidos.contains(cargo)){
            this.cargo=cargo;



        }else{
            this.cargo="pte";
        }

    }



    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                ", id='" + id + '\'' +
                '}';
    }


}