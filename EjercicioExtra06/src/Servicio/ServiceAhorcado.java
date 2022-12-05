/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
//de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
//máximas, el valor que ingresó el usuario y encontradas en 0.
// Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
// Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
// Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
// Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
// Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
public class ServiceAhorcado {

    Scanner scan = new Scanner(System.in);

    public void crearJuego(Ahorcado ah) {
        System.out.println("Ingrese la palabra: ");
        String aux = scan.next();
        String[] vec = new String[aux.length()];
        for (int i = 0; i < aux.length(); i++) {
            vec[i] = aux.substring(i, i + 1);
        }
        ah.setPalabra(vec);
        System.out.println("Ingrese la cantidad máxima de jugadas: ");
        ah.setJugadasMax(scan.nextInt());
        ah.setEncontradas(0);
    }

    public int longitud(Ahorcado ah) {
        return ah.getPalabra().length;
    }

    public boolean buscar(Ahorcado ah, String letra) {
        boolean enc = false;
        for (int i = 0; i < ah.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(ah.getPalabra()[i])) {

                enc = true;
                ah.setEncontradas(ah.getEncontradas()+1);
            }
        }
        if (!enc) {
            System.out.println("LA letra NO pertenece a la palabra");

        } else {
            System.out.println("La letra pertenece a la palabra");
        }
        return enc;

    }

    // Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(Ahorcado ah, String letra) {

        if (buscar(ah, letra)) {
            System.out.println("Número de letras (encontradas, faltantes):( " + ah.getEncontradas() + "," + (longitud(ah) - ah.getEncontradas()) + " )");
            return true;
        } else {
            System.out.println("Número de letras (encontradas, faltantes):( " + ah.getEncontradas() + "," + (longitud(ah) - ah.getEncontradas()) + " )");
            return false;
        }
    }

    public int intentos(Ahorcado ah) {
        return ah.getJugadasMax();
    }

    public void juego(Ahorcado ah) {
        crearJuego(ah);
        while (ah.getEncontradas() < longitud(ah)) {
            System.out.println("");
            System.out.println("Ingrese una letra:");
            String letra = scan.next();
            if (!encontradas(ah, letra)) {                           
                ah.setJugadasMax(ah.getJugadasMax() - 1);
            }
            if (ah.getJugadasMax() == 0) {
                System.out.println("");
                System.out.println("Lo sentimos, no hay más oportunidades");
                break;
            } 
            else {
                System.out.println("");
                System.out.println("Número de oportunidades restantes: " + intentos(ah));
            }
            if(ah.getEncontradas() >= longitud(ah)){
                System.out.println("");
                System.out.println("PALABRA ENCONTRADA!! la misma es: "+Arrays.toString(ah.getPalabra()) );
                
            }
        }

    }

}
