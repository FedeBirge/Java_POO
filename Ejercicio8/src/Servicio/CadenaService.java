/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//Deberá además implementar los siguientes métodos: 
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
//ingresada. 
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
//compone la clase con otra nueva frase ingresada por el usuario.
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
//una nueva frase ingresada por el usuario y mostrar la frase resultante.
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
//frase resultante.
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
public class CadenaService {

    public Cadena crearCadena() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Cadena cad = new Cadena();
        System.out.println("Ingrese una frase o palabra: ");
        cad.setFrase(scan.next());
        cad.setLonguitud(cad.getFrase().length());
        return cad;

    }

    public Cadena crearCadena(String cadS) {
        Cadena cad = new Cadena();
        cad.setFrase(cadS);
        cad.setLonguitud(cadS.length());
        return cad;
    }

    public int mostrarVocales(Cadena cad) {
        int cant = 0;

        for (int i = 0; i < cad.getLonguitud(); i++) {
            switch (cad.getFrase().substring(i, i + 1).toLowerCase()) {
                case ("a"):
                    System.out.print(cad.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;
                case ("e"):
                    System.out.print(cad.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;
                case ("i"):
                    System.out.print(cad.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;
                case ("o"):
                    System.out.print(cad.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;
                case ("u"):
                    System.out.print(cad.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;

            }
        }
        System.out.println("");
        return cant;
    }

    public void invertirFrase(Cadena cad) {
        String mycad = "";
        for (int i = (cad.getLonguitud() - 1); i >= 0; i--) {

            mycad += cad.getFrase().substring(i, i + 1);
        }
        cad.setFrase(mycad);

    }

    public int vecesRepetido(Cadena cad, String letra) {
        int cant = 0;
        for (int i = 0; i < cad.getLonguitud(); i++) {
            if (cad.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                cant++;
            }
        }
        return cant;

    }

    public boolean compararLongitud(Cadena cad, String frase) {
        if (cad.getLonguitud() == frase.length()) {
            return true;
        } else {
            return false;
        }
    }
    public void unirFrases(Cadena cad, String frase)

}
