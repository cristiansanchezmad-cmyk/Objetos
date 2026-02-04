package org.example;

import java.awt.image.RasterOp;
import java.util.ArrayList;
import java.util.Arrays;

public class Lista_Compra {
    static void main() {
        ArrayList<String> compra = new ArrayList<>();
        System.out.println(compra.isEmpty());
    compra.add("pan");
        System.out.println(compra.isEmpty());
        compra.addAll(Arrays.asList("lechuga", "tomate", "galletas", "jamon", "salchichas"));
        System.out.println("El tercer elemento es "+compra.get(2));
compra.add(1, "Queso");
        System.out.println(compra);

        System.out.println("Contiene Leche esta lista "+compra.contains("Leche"));

            if  (!compra.contains("patatas")){

                compra.add("patatas");

            }

        System.out.println("El numero de elementos es "+compra.size());


            compra.clone();
        ArrayList<String> copia= new ArrayList<>(compra);
        copia.clear();

        System.out.println(copia.isEmpty());

        boolean sonIguales=compra.equals(copia);
        System.out.println(sonIguales);
        copia.addAll(Arrays.asList("red bull", "berberechos"));
        System.out.println(copia);
        ArrayList<String> faltantes= new ArrayList<>(compra);
        faltantes.removeAll(copia);
        System.out.println(faltantes);
        ArrayList<Integer> precio= new ArrayList<>(compra.size());
        precio.addAll(Arrays.asList(2, 4, 3, 4, 2,4));
        System.out.println(precio);




    }
}
