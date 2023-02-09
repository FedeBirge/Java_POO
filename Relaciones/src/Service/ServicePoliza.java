/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Poliza;
import Entidad.Vehiculo;
import java.time.LocalDate;
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
        scan = new Scanner(System.in).useDelimiter("\n");
    }
 public void presioneTecla(){
          System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra =scan.next();
    }
    public Poliza crearPoliza() {
        Poliza pol = new Poliza();
//        Integer.SIZE, LocalDate.MIN, LocalDate.MIN, Integer.BYTES, formaPago, 
//        Long.MIN_VALUE, Boolean.TRUE, Integer.MIN_VALUE, tipoCobertura, 
//        cliente, vehiculo, plan
        System.out.println("El numero de poliza se generará automaticamente..");
        presioneTecla();
        pol.setNumero((int)(Math.random()*1000)+1);
        System.out.print("Se generó el numero de poliza: ");
        System.out.println(pol.getNumero());
        pol.setFechaInicio(LocalDate.now());
        
        return pol;

    }

    public void modificarPoliza() {

    }

    public void eliminarPoliza() {

    }
//    public Poliza buscarPoliza(){
//        return 
//    }

    public void mostrarPolizas() {

    }

    public void menuPoliza() {
    }

    public void menu() {
        boolean salir = false;
        ServiceCliente servCliente = new ServiceCliente();
        ServiceVehiculo servVehiculo = new ServiceVehiculo();
        while (!salir) {
            System.out.println("----------*** La Tercera Seguros ***----------");
            System.out.println("");
            System.out.println("1. Gestion de Clientes");
            System.out.println("2. Gestion de Vehiculos");
            System.out.println("3. Gestion de Polizas");

            System.out.println("4. Salir");
            System.out.println("");
            System.out.println("Ingrese una opción:");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    servCliente.menuCliente();
                    break;
                case 2:
                    servVehiculo.menuVehiculo();
                    break;
                case 3:
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                    break;
            }
        }

    }

}
