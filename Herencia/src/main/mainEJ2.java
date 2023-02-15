/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Service.ServiceLavadora;
import Service.ServiceTelevisor;
import java.util.ArrayList;

/**
 *
 * @author feder
 */
public class mainEJ2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        ServiceLavadora servL = new ServiceLavadora();
        //Lavadora lav =  servL.crearLavadora();       
        
//        servL.preciofinal(lav);

//        System.out.println("-----------------------------------------");
//        System.out.println("Precio final de la lavadora es: " + lav.getPrecio());
//        System.out.println("-----------------------------------------");
        
        ServiceTelevisor servT = new ServiceTelevisor();
//        Televisor tv = servT.crearTelevisor();
//        System.out.println("-----------------------------------------");
//        System.out.println("Precio final del televisor: " + tv.getPrecio());
//        System.out.println("-----------------------------------------");
        
    //  Ejercicio 3  Siguiendo el ejercicio anterior, 
    //en el main vamos a crear un ArrayList de Electrodomésticos 
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. 
//Se deberá también mostrar el precio de cada tipo de objeto, es decir, 
//el precio de todos los televisores y el de las lavadoras. Una vez hecho eso, 
// también deberemos mostrar, la suma del precio de todos los Electrodomésticos. 
//Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de 5000, e
//el resultado final será de 7000 (2000+5000) para 
//electrodomésticos, 2000 para lavadora y 5000 para televisor
    ArrayList<Electrodomestico> electros = new ArrayList();
    Lavadora lav1 = new Lavadora(40, 1000F, "gris", 'E', 45F);
    electros.add(lav1);
    Lavadora lav2 = new Lavadora(20, 1000F, "negro", 'D', 24F);
    electros.add(lav2);
    Televisor tv1 = new Televisor(43, Boolean.TRUE, 1000F, "Rojo", 'B', 16F);
    electros.add(tv1);
    Televisor tv2 = new Televisor(43, Boolean.FALSE, 1000F, "Rojo", 'B', 16F);
    electros.add(tv2);
    float todos=0;
    float lavas=0;
    float tvs=0;
        
        for (Electrodomestico electro : electros) {
            if (electro instanceof Lavadora) {
                Lavadora l = (Lavadora) electro;
                servL.preciofinal(l);
                System.out.println("Precio Lavadora: "+l.getPrecio());
                lavas+=l.getPrecio();
                todos+=l.getPrecio();
                continue;
            }
            if (electro instanceof Televisor) {
                Televisor t = (Televisor) electro;
                servT.precioFinal(t);
                System.out.println("Precio TV: "+t.getPrecio());
                tvs+=t.getPrecio();
                todos+=t.getPrecio();
                continue;
            }
            
        }        
        System.out.println("");
        System.out.println("Total precio electrodomesticos: "+todos);
        System.out.println("Total precio lavadoras: "+lavas);
        System.out.println("Total precio tvs: "+tvs);
    }
    
}
