/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Service.ServiceSala;

/**
 *
 * @author feder
 */
public class mainCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceSala serv = new ServiceSala();
        serv.crearSala();
//      serv.mostrarSala();
        serv.sentar();
        System.out.println("");
        serv.mostrarSala();
    }

}
