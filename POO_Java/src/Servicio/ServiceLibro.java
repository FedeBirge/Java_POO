/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServiceLibro {
    
       public Libro cargarLibro(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Libro L = new Libro();
        System.out.println("Ingrese el ISBN:");
        L.setISBN(scan.next());
        System.out.println("Ingrese el Titulo:");
        L.setTitulo(scan.next());
        System.out.println("Ingrese el Autor:");
        L.setAutor(scan.next());
        System.out.println("Ingrese cantidad de :");
        L.setNPaginas(scan.next());
        return L;
}
}