/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServiceJuego {
//    Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.

    public Juego llenarJuego() {
        Scanner scan = new Scanner(System.in);
        ServiceRevolver serv = new ServiceRevolver();
        Revolver r = new Revolver();
        serv.llenarRevolver(r);
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Indique la cantidad de jugadores");
        int cant = scan.nextInt();
        if (cant > 6 || cant < 1) {
            cant = 6;
        }
        for (int i = 0; i < cant; i++) {
            Jugador j = new Jugador();
            j.setId(i + 1);
            jugadores.add(j);

        }
        System.out.println(r);
        System.out.println(jugadores);
        return new Juego(r, jugadores);
    }

//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    public void ronda(Juego juego) {
        ArrayList<Jugador> lista = juego.getJugadores();
        ServiceJugador servJ = new ServiceJugador();
        for (Jugador jugador : lista) {
            if (servJ.disparo(juego.getRevolver(), jugador)) {
                System.out.println(jugador + " !!!!!MOJADO!!!!!!!!");
                break;
            } else {
                System.out.println("OLE!!!!!!!!!");
            }
        }

    }
}
