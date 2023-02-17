/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author feder
 */
public class mainEJ2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        Edificio pol1 = new Polideportivo("El grande", "Techado", 80, 120, 70);
        edificios.add(pol1);
        Edificio pol2 = new Polideportivo("El redondo", "Abierto", 50, 100, 120);
        edificios.add(pol2);
        Edificio of1 = new EdificioDeOficinas(20, 15, 20, 160, 50, 50);
        edificios.add(of1);
        Edificio of2 = new EdificioDeOficinas(10, 12, 10, 80, 40, 60);
        edificios.add(of2);

        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) edificio;
                System.out.println("Superficie poli: " + p.calcularSuperficie());
                System.out.println("Volumen poli: " + p.calcularVolumen());
                System.out.println("El poli es de tipo: " + p.getTipo());
            }
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas e = (EdificioDeOficinas) edificio;
                System.out.println("Superficie oficinas: " + e.calcularSuperficie());
                System.out.println("Volumen oficinas: " + e.calcularVolumen());
                e.cantPersonas();
            }
            System.out.println("");
        }
    }

}
