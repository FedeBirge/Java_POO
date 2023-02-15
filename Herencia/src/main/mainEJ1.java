/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidad.Perro;
import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Service.ServiceCaballo;
import Service.ServiceGato;
import Service.ServicePerro;

/**
 *
 * @author feder
 */
public class mainEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicePerro servPerro = new ServicePerro();
        Animal perro = new Perro("Stich","Carne", 10,"Doberman");
        servPerro.alimentarse(perro);
        ServiceGato servGato = new ServiceGato();
        Animal gato = new Gato("Pelusa","Galletas", 5, "Siames");
        servGato.alimentarse(gato);
        ServiceCaballo servCaballo = new ServiceCaballo();
        Animal cab = new Caballo("Spark", "Pasto",25, "Fino");
        servCaballo.alimentarse(cab);
        
    }
    
}
