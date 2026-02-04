package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
 static void main(String[] args) {
Bocadillo pepito = new Bocadillo("pepito", "normal", "bacon", "salsa deluxe", 4.99);

    pepito.imprimirInfoBocata();

pepito.imprimirInfoBocata();

     System.out.println(pepito.getnombre()+ " "+pepito.getprecio()+ "€");

 Bocadillo vacio = new Bocadillo();

 vacio.setnombre("chivito");

     vacio.imprimirInfoBocata();


 }
}
