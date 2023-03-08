/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import Entidad.Rectangulo;
import Servicio.RectanguloService;

/**
 *
 * @author feder
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloService recserv= new RectanguloService();
        Rectangulo rec = recserv.crearRectangulo();
        System.out.println("La superfice es: "+recserv.superficie(rec));
        System.out.println("");
        System.out.println("El perimetro es: "+recserv.perimetro(rec));
        System.out.println("");
        recserv.dibujarRectangulo(rec);
    }
    
}
