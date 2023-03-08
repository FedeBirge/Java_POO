/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author feder
 */
// Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
//(Tipo Date), constructor vacío, constructor parametrizado, get y set.
public class Persona {
    private String nombre;
    private Date fecha;

    public Persona() {
    }

    public Persona(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona: \n"
                + "" + "Nombre = " + nombre + ", fecha = " + fecha.toLocaleString() + '}';
    }
    
    
}
