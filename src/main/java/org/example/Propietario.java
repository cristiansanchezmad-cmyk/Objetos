package org.example;

public class Propietario {
    private String nombre;
    private int edad;

    public int getEdad() {
        return edad;
    }
    public Propietario(String nombre, int edad){
       this.nombre=nombre;
       this.edad=edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
