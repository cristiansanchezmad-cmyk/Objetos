package org.example.Practica_1;

public class Empleado {
    private static int contadorEmpleados=0;
    private String nombre;
    private String cargo;
    private static final String CADENA="EP00";
    private Empleado director=null;


    public Empleado(String nombre, String cargo){
        this.nombre=nombre;
        this.cargo=cargo;
        contadorEmpleados++;
    }

    private String calcularID(){
        return CADENA+contadorEmpleados;
    }
    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }
    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public static void setContadorEmpleados(int contadorEmpleados) {
        Empleado.contadorEmpleados = contadorEmpleados;
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
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }




}
