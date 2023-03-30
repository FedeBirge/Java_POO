/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidad.Persona;

/**
 *
 * @author feder
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        String nombre = null;
        try{
            if(!nombre.equals(null)){
                p1.setNombre(nombre);
            }
        }
        catch(Exception e){
            System.out.println("nombre no puede null");}
//        p1.setNombre("Fede");
//        p2.setNombre(p1.getNombre());
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.getNombre().equals(p2.getNombre()));
    }
    
}
