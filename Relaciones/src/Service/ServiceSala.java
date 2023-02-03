/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Asiento;
import Entidad.Pelicula;
import Entidad.Persona;
import Entidad.Sala;
import java.util.ArrayList;

/**
 *
 * @author feder
 */
public class ServiceSala {

    private Sala sala;
    private ArrayList<Persona> espectadores;

    public ServiceSala() {
        this.espectadores = new ArrayList();
        this.sala = new Sala();
        espectadores.add(new Persona("Fede", 37, (float) 5000.5));
        espectadores.add(new Persona("Mauri", 43, (float) 300.5));
        espectadores.add(new Persona("Gabriel", 34, (float) 8000.5));
        espectadores.add(new Persona("Valentino", 18, (float) 1000.5));
        espectadores.add(new Persona("Carlos", 39, (float) 100.5));
        espectadores.add(new Persona("Tincho", 26, (float) 2000.5));
        espectadores.add(new Persona("Santi", 18, (float) 3000.5));
        sala.setPrecio((float) 500);
        sala.setPelicula(new Pelicula("Star Wars", 2.35F, 21, "Lucas"));
    }

    public void crearSala() {
        ArrayList<Asiento> asientos = new ArrayList();
        for (int fila = 8; fila > 0; fila--) {

            for (int columna = 0; columna < 6; columna++) {
                String letra = Character.toString((char) (65 + columna));
                String asiento = fila + letra;
                Asiento as = new Asiento();
                as.setNombre(asiento);
                //System.out.println(asiento);
                asientos.add(as);
            }

        }
        sala.setAsientos(asientos);
    }

    public void mostrarSala() {

        ArrayList<Asiento> asientos = sala.getAsientos();
        int cont = 0;
        for (Asiento asiento : asientos) {
            System.out.print(asiento);
            cont++;
            if (!asiento.getOcupado()) {
                System.out.print(" X ");
            } else {
                System.out.print("   ");
            }
            if (cont == 6) {
                System.out.println("");
                cont = 0;
            } else {
                System.out.print("|");
            }

        }

    }

    public void sentar() {

        for (Persona espec : espectadores) {
            if (sala.getPrecio() > espec.getDinero() || sala.getPelicula().getEdadMin() > espec.getEdad()) {
                continue;
            } else {
                boolean ocupado = true;
                while (ocupado) {
                    String columna = Character.toString((char) ((Math.random() * 6) + 65));
                    int fila = (int) (Math.random() * 6) + 1;
                    String asiento = fila + columna;
                    ArrayList<Asiento> asientos = sala.getAsientos();
                    for (Asiento as : asientos) {

                        if (asiento.equals(as.getNombre())) {
                            System.out.println(asiento + " " + as.getNombre() + " " + espec.getNombre());
                            if (as.getOcupado()) {
                                break;
                            } else {
                                as.setOcupado(true);
                                ocupado = false;
                            }
                        }

                    }

                }
            }

        }

    }

}
