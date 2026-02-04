package org.example.Practica_1;

import org.example.Casa;

import java.util.ArrayList;

public class Cadena {


    private String nombre;
    private ArrayList  <Programa> listaProgramas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }


    public Cadena(String nombre){
        this.nombre=nombre;
        listaProgramas=new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}
