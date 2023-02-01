/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Service.ServiceCarta;

/**
 *
 * @author feder
 */
public class JuegoBaraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServiceCarta serv = new ServiceCarta();
       serv.iniciarBaraja();
       
       serv.barajar();
       serv.darCartas();
       serv.mostrarBaraja();
       serv.mostrarMonton();
    }
    
}
