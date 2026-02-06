package org.example.Practica_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;




    public Programa(String nombre, Cadena cadena, String director){

        this.nombre=nombre;
        this.cadena=cadena;
        this.temporadas=0;
        Empleado jefe=new Empleado(director,"director",null);
        this.director=jefe;
        this.listaEmpleados=new ArrayList<>();
        this.listaInvitados=new ArrayList<>();
        this.listaEmpleados.add(jefe);




    }

//    public void cambiarCadena(Cadena nuevaCadena){
//        if (this.cadena!=null){
//          this.cadena.eliminarPrograma(this);
//            if ()
//
//        }
//
//    }

    public void crearEmpleado(String nombre, String cargo, Empleado director){

        Empleado e= new Empleado(nombre, cargo,director);
        listaEmpleados.add(e);
    }
    public void crearInvitado(String nombre, String profesion, int temporada, LocalDate fecha){

        Invitado i=new Invitado(nombre, profesion, temporada, fecha);

        listaInvitados.add(i);

    }
    public void invitadosTemporada( int temporadas){

        int cont=0;

        for (Invitado i : listaInvitados){

            if (i.getTemporada()==temporadas){

                cont++;

                System.out.println("El nombre del invitadp es "+ i.getNombre()+" y su profesion es "+i.getProfesion());
            }

        }
        System.out.println("Han habido un total de "+cont+" invitados");



    }

    public int vecesInvitado(String nombre) {
        int cont = 0;
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equals(nombre)) {

                cont++;

            }

        }
        System.out.println("La cantidad de veces que ha sido invitado "+nombre+" es de "+cont+" veces");

        return cont;
    }


    public void rastrearInvitado(String nombre) {
        int veces= vecesInvitado(nombre);
        System.out.println(nombre+" Ha sido invitado "+veces+" veces");
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equals(nombre)) {


                System.out.println(nombre+" Vino en la temporada"+i.getTemporada()+ " en la fecha "+i.getFecha_visita());

            }


        }

    }
    public boolean buscarInvitado(String nombre){
        boolean existe = false;

        for (Invitado i : listaInvitados){
            if (i.getNombre().toLowerCase().equals(nombre.toLowerCase())){
                System.out.println(nombre + " ha acudido al programa");
                existe = true;
                return existe;

            }

        }
        System.out.println(nombre + " no ha acudido al programa");

        return existe;
    }


    public void crearEmpleados(String nombre, String cargo){

        Empleado e= new Empleado(nombre,cargo,this.director);
        listaEmpleados.add(e);

    }

    public void crearInvitados(String nombre, String profesion, int temporadas, LocalDate fecha){

        Invitado i= new Invitado(nombre, profesion, temporadas, fecha);
        listaInvitados.add(i);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }
    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }




    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }


}