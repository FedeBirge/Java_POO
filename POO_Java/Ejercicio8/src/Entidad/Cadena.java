/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author feder
 */
//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
//y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
//que puede ser una palabra o varias palabras separadas por un espacio en blanco y a 
//través de los métodos set, se guardará la frase y la longitud de manera automática según 
//la longitud de la frase ingresada
public class Cadena {
    private String frase;
    private int longuitud;

    public Cadena() {
    }

    public Cadena(String frase, int longuitud) {
        this.frase = frase;
        this.longuitud = longuitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLonguitud() {
        return longuitud;
    }

    public void setLonguitud(int longuitud) {
        this.longuitud = longuitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longuitud=" + longuitud + '}';
    }
    
    
    
}
