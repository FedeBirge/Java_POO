/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Service.ServicePelicula;

/**
 *
 * @author feder
 */
public class PeliculaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicePelicula serv = new ServicePelicula();
        serv.cargarPeliculas();
        System.out.println("Se muestran todas las peliculas");
        serv.mostrarPeliculas();
        System.out.println("");
        serv.mostrarPeliculasMasHora();
        System.out.println("");
        serv.ordenarDuracionDesc();
        serv.mostrarPeliculas();
        System.out.println("");
        serv.ordenarDuracionAsc();
        serv.mostrarPeliculas();
        System.out.println("");
        serv.ordenarTitulo();
        serv.mostrarPeliculas();
        System.out.println("");
        serv.ordenarDirector();
        serv.mostrarPeliculas();
        System.out.println("");
    }

}
