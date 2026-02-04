package org.example.biblio;

public class EstudiantesApp {
    static void main(String[] args) {
        Estudiante jorge=new Estudiante("jorge","1-Dam", "jorge@iesmutxamel.com");
       // System.out.println(jorge.getNia());
        //System.out.println(jorge);
        Estudiante raul= new Estudiante("raul");
        System.out.println(raul.getNia());
       // System.out.println(raul);

        Estudiante adrian = new Estudiante("adrian");
        System.out.println("Hay "+Estudiante.ObetenerTotalEstudiantes()+ " estudiantes.");
        System.out.println(Estudiante.validadCorreo("@patrimutxamel.com"));
        System.out.println(Estudiante.validadCorreo("patri@alu.edu.gva.es"));

        Editorial editorial= new Editorial("Millenium","España");


        Libro divina_comedia= new Libro("divina comedia", "dante ali", editorial);

       System.out.println(divina_comedia);
        Prestamo p1=divina_comedia.prestar(jorge);
        System.out.println("Fecha de préstamo: "+ p1.getFecha());
//        divina_comedia.prestar();
//divina_comedia.devolver();*/

        divina_comedia.prestar(jorge);
        System.out.println(jorge);

        System.out.println(divina_comedia.Disponible());
        System.out.println(divina_comedia);

        System.out.println("Libros disponibles: "+Libro.getLibrosDisponibles());
        System.out.println("Libros totales: "+Libro.getTotalLibros());
        System.out.println(divina_comedia);
        divina_comedia.devolver();
        divina_comedia.devolver();
        System.out.println(divina_comedia.Disponible());
        System.out.println(divina_comedia);

    }

}
