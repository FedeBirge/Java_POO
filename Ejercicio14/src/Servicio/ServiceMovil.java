/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
// Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
//private String marca;
//    private float precio;
//    private String modelo;
//    private int memoriaRam;
//    private int almacen;
//    private int[] codigo;
public class ServiceMovil {
    Scanner scan = new Scanner(System.in);
    
    private int[] insertarCodigo(){
        int[] cod = new int[7];
        for (int i = 0; i < 7; i++) {
            cod[i]= (int) (Math.random()*10);           
        }
        return cod;
        
    }
    
    public void cargarCelular(Movil mov){
        System.out.println("Ingrese la marca del movil:");
        mov.setMarca(scan.next());
        System.out.println("Ingrese el precio del movil: ");
        mov.setPrecio(scan.nextFloat());
        System.out.println("Ingrese el modelo del movil: ");
        mov.setModelo(scan.next());
        System.out.println("Ingrese memoria RAM del movil: ");
        mov.setMemoriaRam(scan.nextInt());
        System.out.println("Ingrese capacidad de almacenamiento: ");
        mov.setAlmacen(scan.nextInt());
        mov.setCodigo(insertarCodigo());
        
        
    }
    
    
}
