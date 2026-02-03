package org.example;

public class Persona {
    private String nombre;
    private String dni;
    private int edad;

    public Persona (String nombre, String dni, int edad){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }
    public void setnombre (String nombre){
        this.nombre=nombre;
    }
    public String getdni(){
        return dni;
    }
    public void getdni(String dni){
        this.dni=dni;
    }
public  int getEdad(){
        return edad;
}
public void setEdad(int edad){
        this.edad=edad;
}
public void imprimirDatos(){
    System.out.println("Tu nombre es "+this.nombre+ " con dni "+this.dni+" y con "+this.edad+ " años");
}
}

