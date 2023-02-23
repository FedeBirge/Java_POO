/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Alojamiento;
import Entidad.Hotel4;
import Entidad.Hotel5;
import java.util.ArrayList;

/**
 *
 * @author feder
 */
public class ServiceAlojamiento {

    private ArrayList<Alojamiento> lista;
    public ServiceAlojamiento() {
        lista = new ArrayList<>();
        
        Hotel4 a = new Hotel4("A", "La cocinita",50, 120, 210, 4, 0, "Yeraton", "La Rioja 16", "Carlos Paz", "Guido Suller");
        a.calcularPrecio();
        lista.add(a);
        Hotel4 a1 = new Hotel4("B", "La cueva vegana", 50, 80, 100, 3, 0,"Colonial", "Mexico 455", "Cordoba", "Susano Gimenez");
        a1.calcularPrecio();
        lista.add(a1);
        
        Hotel5 a2 = new Hotel5(3, 10, 10, "A", "El fideo de carne", 28, 68,80, 2, 0, "Las pajaritas", "Jujuy 154", "Villa Allende", "Juan Perez");
        a2.calcularPrecio();
        lista.add(a2);
        Hotel5 a3 = new Hotel5(2, 13, 23, "A", "El parrillita loca", 50, 88,150, 3, 0, "Big Hotel", "Colon 3454", "Alta Gracia", "Juan Perez");
        a3.calcularPrecio(); 
        lista.add(a3);
        for (Alojamiento alojamiento : lista) {
            System.out.println(alojamiento);
            System.out.println("");
        }
    }

    
    
}
