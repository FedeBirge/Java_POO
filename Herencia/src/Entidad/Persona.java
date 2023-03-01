/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author feder
 */
//Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//identificación y su estado civil. 
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected Long dni;
    protected String estCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Long dni, String estCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estCivil = estCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }
//    Cambio del estado civil de una persona. 
    public void cambiarEstado(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        if(estCivil==null){
            System.out.println("La persona no tiene estado civil definido..");
        }
        else{
            System.out.println("El estado civil actual es: "+this.estCivil);
        }
        System.out.println("Ingrese el nuevo estado civil(CASADO - SOLTERO - VIUDO)");
        this.estCivil= scan.next();
    }
    @Override
    public String toString() {
        return  nombre + " " + apellido + ", dni: " + dni + ", Estado Civil: " + estCivil ;
    }
    
    
    
}
