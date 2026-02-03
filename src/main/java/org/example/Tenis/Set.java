package org.example.Tenis;

public class Set {

    private int puntosj1;
    private int Puntosj2;


    public Set(int puntosj1, int puntosj2){

        this.puntosj1=puntosj1;
        this.Puntosj2=puntosj2;
    }



    public int getPuntosj1() {
        return puntosj1;
    }

    public void setPuntosj1(int puntosj1) {
        this.puntosj1 = puntosj1;
    }

    public int GetPuntosj2() {
        return Puntosj2;
    }

    public void setPuntosj2(int getPuntosj2) {
        this.Puntosj2 = getPuntosj2;
    }
    @Override
    public String toString() {
        return "Set{" +
                "puntosj1=" + puntosj1 +
                ", getPuntosj2=" + Puntosj2 +
                '}';
    }


}
