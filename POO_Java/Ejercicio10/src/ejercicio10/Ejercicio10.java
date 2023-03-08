/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author feder
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
//    Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
//20.
    public static void main(String[] args) {
        float[] A = new float[50];
        float[] B = new float[20];

        for (int i = 0; i < 50; i++) {
            A[i] = (float) Math.random() * 10;
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        Arrays.sort(A);

        B = Arrays.copyOf(A, 20);
        
        Arrays.fill(B, 10, 20, (float) 0.5);

        for (int i = 0; i < 50; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print(B[i] + " ");
        }
    }

}
