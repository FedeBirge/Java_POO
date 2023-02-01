/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Service.ServicePersona;

/**
 *
 * @author feder
 */
public class AdoptarPerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicePersona serv = new ServicePersona();
        serv.cargarListas();
        serv.adoptar();
        serv.mostrarPersonas();
    }
    
}
