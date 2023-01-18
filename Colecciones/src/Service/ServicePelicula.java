/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
//crear otra Pelicula o no
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
public class ServicePelicula {
    private ArrayList<Pelicula> listaPeli;
    private Scanner scan = new Scanner(System.in);
    public ServicePelicula() {
        this.listaPeli= new ArrayList();
    }
    
public void cargarPeliculas(){
       System.out.println("-------------Se solictan datos de peliculas-------------");
       System.out.println("");
    do{
         Pelicula peli = new Pelicula();
         System.out.println("Ingrese el titulo de la pelicula:");
         peli.setTitulo(scan.next());
         System.out.println("Ingrese en nombre del director de la pelicula:");
         peli.setDirector(scan.next());
         System.out.println("Ingrese la duracion de la pelicula:");
         peli.setDuracion(scan.nextFloat());
         listaPeli.add(peli);
         System.out.println("Desea ingresar otra pelicula? (S/N)");
         String res = scan.next();
         if(res.equals("N")){
             break;
         }
         
    }while(true);
   
}  
public void mostrarPeliculas(){
    System.out.println("Se muestran todas las peliculas");
    for (Pelicula peli : listaPeli) {
        System.out.println(peli);
        
    }
    
}
public void mostrarPeliculasMasHora(){
   System.out.println("Se muestran todas las peliculas mayor a una hora de duraccion");
    for (Pelicula peli : listaPeli) {
      if(peli.getDuracion()>1){
        System.out.println(peli);
      }
    }
    
}
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
//pantalla.
public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1, Pelicula p2){
    return p1.getDuracion().compareTo(p2.getDuracion());
}
    
};
public void ordenarDuracion(){
   Collections.sort(listaPeli, compararDuracion);
    Collections.reverse(listaPeli);
    
}
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
//pantalla.
    public void ordenarDuracionMenor(){
   Collections.sort(listaPeli, compararDuracion);
    
    
}
    
}
