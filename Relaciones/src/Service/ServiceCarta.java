/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServiceCarta {

    private ArrayList<Carta> baraja;
    private ArrayList<Carta> monton;

    public ServiceCarta() {
        baraja = new ArrayList();
        monton = new ArrayList();
    }

    public void iniciarBaraja() {

        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta();
            if (i == 8 || i == 9) {
                continue;
            } else {
                carta.setNumero(i);
                carta.setPalo("Copas");
                baraja.add(carta);
            }
        }
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta();
            if (i == 8 || i == 9) {
                continue;
            } else {
                carta.setNumero(i);
                carta.setPalo("Oros");
                baraja.add(carta);
            }
        }
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta();
            if (i == 8 || i == 9) {
                continue;
            } else {
                carta.setNumero(i);
                carta.setPalo("Basto");
                baraja.add(carta);
            }
        }
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta();
            if (i == 8 || i == 9) {
                continue;
            } else {
                carta.setNumero(i);
                carta.setPalo("Espadas");
                baraja.add(carta);
            }
        }
    }
//    barajar(): cambia de posición todas las cartas aleatoriamente.

    public void barajar() {
        Collections.shuffle(baraja);
    }

//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta() {
        if (baraja.isEmpty()) {
            System.out.println("No quedan cartas en la baraja");
            return new Carta();

        } else {
            return baraja.get(0);
        }
    }
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.

    public int cartasDisponibles() {
        return baraja.size();
    }
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.

    public void darCartas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Solicite un numero de cartas");
        int num = scan.nextInt();
        if (num > cartasDisponibles()) {
            System.out.println("Debe solicitar un numero menor de cartas");

        } else {
            for (int i = 1; i < num + 1; i++) {
                System.out.println(siguienteCarta());
                monton.add(siguienteCarta());
                baraja.remove(0);

            }
            System.out.println("");
        }
    }

//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void mostrarMonton() {
        if (monton.isEmpty()) {
            System.out.println("No salió ninguna carta de la baraja");
        } else {
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }

    }

//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja() {
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }

}
