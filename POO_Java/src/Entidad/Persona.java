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

    public Persona(String nombre, String DNI, String FechaNac) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.FechaNac = FechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", FechaNac=" + FechaNac + '}';
    }
    
    
}
