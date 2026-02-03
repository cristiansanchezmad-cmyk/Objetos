package org.example;

import java.util.ArrayList;

public class Habitacion {
    private String nombre;
    private double metros;

    private ArrayList<Electrodomestico> listaElectrodomesticos;



    public Habitacion (String nombre, double metros){
        this.nombre=nombre;
        this.metros=metros;
        listaElectrodomesticos=new ArrayList<>();
    }

    public void agregarElectrodomestico (String nombre, int consumo ){
        for (Electrodomestico electrodomestico: listaElectrodomesticos ){
        if (electrodomestico.getNombre().equals(nombre)){
            System.out.println("El electrodoméstico "+nombre+" ya existe");
        }
    }

 Electrodomestico electrodomestico= new Electrodomestico(nombre, consumo);

}

public  void  mostrasElectrodomestico(){
        System.out.println("Electrodomesticos de la habitacion: "+nombre);
        for (Electrodomestico electrodomestico: listaElectrodomesticos){
            System.out.println(" -"+electrodomestico.getNombre()+" ("+electrodomestico.getConsumo()+")kWH");
        }
    }
    public double calcularConsumo(){
        double res=0;
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {
           res+=listaElectrodomesticos.get(i).getConsumo();
        }
        System.out.println("La habitacion"+getNombre()+" tiene en total" +res+" de consumo");
        return res;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }
public ArrayList<Electrodomestico> getListaElectrodomesticos() {
    return listaElectrodomesticos;
}

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }

    }

