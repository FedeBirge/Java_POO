/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author feder
 */

// Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
//con sus 3 notas. 
public class Alumno {
    private String nombre;
    private Integer[] notas;

    public Alumno() {
        
        this.notas = new Integer[3];
    }

    public Alumno(String nombre, Integer[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public void setNotas(Integer[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno "+nombre + ", notas= " + Arrays.toString(notas) + "}";
    }
    
    
    
    
}
