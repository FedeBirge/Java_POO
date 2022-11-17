/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author feder
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
//    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
//sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
//mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
    public static void main(String[] args) {
        Persona[] pers = new Persona[4];
        PersonaService perserv = new PersonaService();
        int debajo = 0, ideal = 0, mayor = 0;
        for (int i = 0; i < 4; i++) {
            pers[i] = perserv.crearPersona();
            switch (perserv.calcularIMC(pers[i])) {
                case -1:
                    System.out.println("La persona " + (i + 1) + " esta por debajo del peso ideal");
                    debajo++;
                    break;
                case 0:
                    System.out.println("La persona " + (i + 1) + " esta dentro del peso ideal");
                    ideal++;
                    break;
                case 1:
                    System.out.println("La persona " + (i + 1) + " esta por encima del peso ideal(sobrepeso)");
                    break;
            }
            if (perserv.esMayorDeEdad(pers[i])) {
                System.out.println("Es mayor de edad");
                mayor++;
            } else {
                System.out.println("Es menor de edad");
            }

        }
        System.out.println("Por debajo de su peso está " + (debajo * 100 / 4) + "% de 4 personas ");
        System.out.println("En peso ideal está " + (ideal * 100 / 4) + "% de 4 personas ");
        System.out.println("Por encima de su peso está " + ((4 - (ideal + debajo)) * 100 / 4) + "% de 4 personas ");
        System.out.println((mayor * 100 / 4) + "% son mayores ");
        System.out.println(((4 - mayor) * 100 / 4) + "% son menores ");

    }

}
