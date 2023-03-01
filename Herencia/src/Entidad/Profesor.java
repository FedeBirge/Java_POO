/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author feder
 */
//Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
//pertenecen (lenguajes, matemáticas, arquitectura, ...). 

public class Profesor extends Empleado {
    private String dpto;

    public Profesor() {
    }

    public Profesor(String dpto) {
        this.dpto = dpto;
    }

    public Profesor(String dpto, LocalDate incorpora, Integer despacho) {
        super(incorpora, despacho);
        this.dpto = dpto;
    }

    public Profesor(String dpto, LocalDate incorpora, Integer despacho, String nombre, String apellido, Long dni, String estCivil) {
        super(incorpora, despacho, nombre, apellido, dni, estCivil);
        this.dpto = dpto;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    @Override
    public String toString() {
        return "Profesor--> "+nombre+" "+ apellido+", "+ dni+", " + estCivil 
                +". Fecha incorporacion: "+ incorpora+"\nN° de despacho: "+ despacho+ ". Departamento: " + dpto ;
    }
    
    
}
