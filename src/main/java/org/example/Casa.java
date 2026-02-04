package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    static  Scanner teclado = new Scanner(System.in);
    private String direccion;




    private Propietario propietario;
    private ArrayList<Habitacion> listaHabitaciones;
    public Casa(String direccion){
        this.direccion=direccion;
        listaHabitaciones=new ArrayList<>();
setPropietario();
    }

    public void crearHabitacion(String nombre, double metros){

        for (Habitacion habitacion:listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitación "+nombre+" ya existe");
                return;
            }
        }
        Habitacion habitacion= new Habitacion(nombre,metros);
        listaHabitaciones.add(new Habitacion(nombre,metros));
        System.out.println("Habitación "+nombre+ " creada");

    }

    public void eliminarHabitaciones(String nombre){

        for (Habitacion habitacion:listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitaciñon "+nombre+" borrada con éxito");
            return;
            }
        }
        System.out.println("La habitación "+nombre+ " ya no existe");
    }

    public  void MostrarHabitaciones(){
        System.out.println("Casa en "+direccion+ " tiene "+listaHabitaciones.size()+ " habitaciones");
        for (Habitacion habitacion: listaHabitaciones){
            System.out.println("- "+habitacion.getNombre()+ " ("+ habitacion.getMetros()+") m2");
        }
    }

    public Habitacion getHabitacionmasGrande(){
        Habitacion mayor=listaHabitaciones.get(0);
        for (Habitacion habitacion: listaHabitaciones){

            if (habitacion.getMetros()> mayor.getMetros()){
                mayor=habitacion;
            }
        }
        return mayor;

    }
public Habitacion gethabitacionConsumo() {
Habitacion max=listaHabitaciones.get(0);
for (Habitacion habitacion: listaHabitaciones){
    if (max.calcularConsumo()<habitacion.calcularConsumo()){
max=habitacion;
    }
}
return max;
    }


    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){

    }
    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario");
        String nombre=teclado.nextLine();
        System.out.println("Edad:");
        int edad= teclado.nextInt();
        teclado.nextLine();
        Propietario propietario =new Propietario(nombre,edad);
        this.propietario = propietario;
        System.out.println("Prpietario "+nombre+" añadido");
    }
    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", propietario=" + propietario +
                '}';
    }
}
