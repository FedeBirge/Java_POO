/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidad.Pais;
import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author feder
 */
public class Compa {

    public static Comparator<Pelicula> compararDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }

    };
    public static Comparator<Pelicula> compararDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }

    };
    public static Comparator<Pelicula> compararTituloAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }

    };
    public static Comparator<Pelicula> compararDirectorAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }

    };
    public static Comparator<Pais> compararPais = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return p2.getNombre().compareTo(p1.getNombre());
        }

    };

}
