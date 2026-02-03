package org.example;

public class TelevisorApp {
    static void main(String[] args) {
        Televisor lg= new Televisor(5, 50);
lg.subircanal();
lg.subircanal();
lg.subircanal();
lg.bajarvolumen();
lg.bajarvolumen();
lg.bajarcanal();
lg.subirvolumen();
        System.out.println(lg.getCanal()+ " "+ lg.getVolumen());

Televisor hola = new Televisor(); //Al no especificar ni el volumen ni el canal, saldrá como 1 y 5

Televisor samsung = new Televisor();

        System.out.println(samsung.getCanal()+" "+samsung.getVolumen());

    }
}
