package org.example;

import java.util.Scanner;

public class PacienteApp {
    static Scanner teclado= new Scanner(System.in);
    static void main() {
        Paciente paco= new Paciente("juan", 12, 'G',10,166);
        System.out.println(paco.getDni());

        System.out.println(paco.calcularIMC());
if (paco.esMayorDeEdad()){
    System.out.println("Es mayor de edad");
}else{
    System.out.println("Es menor");
}
paco.mostrarInfoPaciente();
        System.out.println(paco.getGenero());

        System.out.println("Introduce tu nombre");
        String nombre=teclado.nextLine();
        System.out.println("Introduce tu edad");
        int edad=teclado.nextInt();
        System.out.println("Introduce tu genero");
        char genero=teclado.next().charAt(0);
        System.out.println("Introduce tu peso");
        float peso= teclado.nextFloat();
        System.out.println("Introduce tu altura");
        int altura=teclado.nextInt();

        Paciente Paciente1 = new Paciente(nombre, edad, genero, peso, altura);

        Paciente1.mostrarInfoPaciente();
Paciente1.calcularIMC();
Paciente1.esMayorDeEdad();
        System.out.println();

        Paciente Paciente2= new Paciente(nombre,edad,genero,0, 0);
Paciente2.mostrarInfoPaciente();
        Paciente Paciente3=new Paciente();
        Paciente3.setNombre("Mateo");
        Paciente3.setEdad(12);
        Paciente3.setGenero('M');
        Paciente3.setAltura(160);
        Paciente3.setPeso(120);
        Paciente3.mostrarInfoPaciente();
        System.out.println();
        System.out.println(Paciente3);

    }
}
