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
public class Persona {
    public String nombre;
    public String DNI;
    public String FechaNac;
    private Libro libro;
    private Circunferencia cir;

    public Persona() {
    }

    public Persona(String nombre, String DNI, String FechaNac, Libro libro) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.FechaNac = FechaNac;
        this.libro = libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    
    
}
