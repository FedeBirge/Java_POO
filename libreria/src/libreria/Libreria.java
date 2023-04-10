/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;


import libreria.servicios.AutorService;
import libreria.servicios.LibreriaService;

/**
 *
 * @author feder
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        try {
            LibreriaService serv = new LibreriaService();
            serv.menu();
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
        
    }
    
}
