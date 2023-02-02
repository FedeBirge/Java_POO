/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
/**
 *
 * @author feder
 */
public class Sala {
    private Pelicula pelicula;
    private ArrayList<Asiento>asientos = new ArrayList<>();
    private Float precio;

    public Sala() {
    }

    public Sala(Pelicula pelicula, Float precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }   

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Sala{" + "pelicula=" + pelicula + ", asientos=" + asientos + ", precio=" + precio + '}';
    }
    
}
