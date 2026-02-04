package org.example.biblio;

public class Editorial {
private String nombre;



    private  String pais;

public Editorial (String nombre, String pais){
    this.nombre=nombre;
    this.pais=pais;
}
public Editorial(){


}
public String getPais() {
    return pais;
}

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
