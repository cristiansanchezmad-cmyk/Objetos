package org.example.Practica_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;
    private LocalDate fecha_primera;


    public Cadena(String nombre){

        this.nombre=nombre;
        this.listaProgramas=new ArrayList<>();
        this.fecha_primera=fecha_primera;

    }
    public void añadirPrograma(Programa p) {
        listaProgramas.add(p);
    }
    public void invitadoAntes(String nombreInvitado) {
        Programa primerPrograma = null;
        LocalDate fechaPrimera = null;

        for (Programa p : listaProgramas) {
            for (Invitado i : p.getListaInvitados()) {
                if (i.getNombre().equalsIgnoreCase(nombreInvitado)) {
                    if (fechaPrimera == null || i.getFecha_visita().isBefore(fechaPrimera)) {
                        fechaPrimera = i.getFecha_visita();
                        primerPrograma = p;
                    }
                }
            }
        }

        if (primerPrograma != null) {
            System.out.println(nombreInvitado + " estuvo primero en " + primerPrograma.getNombre() +
                    " el día " + fechaPrimera.getDayOfMonth());
        } else {
            System.out.println("El invitado " + nombreInvitado + " no ha estado en ningún programa de esta cadena.");
        }
    }
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

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }


}