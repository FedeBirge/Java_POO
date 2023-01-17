/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Service.ServiceAlumno;

/**
 *
 * @author feder
 */
public class AlumnoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceAlumno serv = new ServiceAlumno();
        serv.CargarAlumnos();
        System.out.println("");
        serv.MostrarAlumnos();
        float n = serv.notaFinal();
        if(n==0){
            System.out.println("El alumno no existe");
        }
        else{
            System.out.println("La nota final es: " + n);
        }
        
    }
    
}
