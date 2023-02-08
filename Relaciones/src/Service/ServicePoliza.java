/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Poliza;
import Entidad.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServicePoliza {
    ArrayList<Poliza> polizas;
    private Scanner scan;

    public ServicePoliza() {
        polizas = new ArrayList();
        scan = new Scanner(System.in);
    }
    public void crearPoliza(){
        
    }
    public void modificarPoliza(){
        
    }
    public void eliminarPoliza(){
        
    }
//    public Poliza buscarPoliza(){
//        return 
//    }
    public void mostrarPolizas(){
        
    }
    
    public void menuPoliza(){
        boolean salir = false;
        ServiceCliente servCliente = new ServiceCliente();
        while (!salir) {
            System.out.println("----------*** La Tercera Seguros ***----------");
            System.out.println("");
            System.out.println("1. Gestion de clientes");
            System.out.println("2. Gestion..");
            System.out.println("3. Gestion..");
            System.out.println("4. Gestion..");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese una opción:");
            int op = scan.nextInt();
            switch (op) {
                case 1:servCliente.menuCliente();
                      break;
                
                case 2:
                 
                case 3:
                   
                case 4:
                  
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                    menuPoliza();
            }
        }

    }
        
    }
    
    

