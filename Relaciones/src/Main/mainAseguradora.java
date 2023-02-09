/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Service.ServiceCuota;
import Service.ServicePoliza;

/**
 *
 * @author feder
 */
public class mainAseguradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ServicePoliza serv = new ServicePoliza();
    ServiceCuota servCuo= new ServiceCuota();
       serv.menu();
       
    }
    
   
}
