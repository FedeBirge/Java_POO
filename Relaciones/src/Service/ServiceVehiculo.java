/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Cliente;
import Entidad.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServiceVehiculo {

    ArrayList<Vehiculo> vehiculos;
    private Scanner scan;

    public ServiceVehiculo() {
        vehiculos = new ArrayList();
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public Vehiculo crearVehiculo() {
//        new Vehiculo(patente, marca, modelo, Integer.SIZE, motor, chasis, color, tipo);
        Vehiculo ve = new Vehiculo();
        System.out.println("Ingrese la Patente del vehiculo:");
        ve.setPatente(scan.next());
        System.out.println("Ingrese la Marca del vehiculo:");
        ve.setMarca(scan.next());
        System.out.println("Ingrese el Modelo del vehiculo:");
        ve.setModelo(scan.next());
        System.out.println("Ingrese el anio del vehiculo:");
        ve.setAnio(scan.nextInt());
        System.out.println("Ingrese el N° del motor del vehiculo:");
        ve.setMotor(scan.next());
        System.out.println("Ingrese el N° del chasis del vehiculo:");
        ve.setChasis(scan.next());
        System.out.println("Ingrese el color del vehiculo:");
        ve.setColor(scan.next());
        System.out.println("Ingrese el tipo del vehiculo:");
        ve.setTipo(scan.next());
        vehiculos.add(ve);
        return ve;

    }

    public void modificarVehiculo() {
        Vehiculo ve = buscarVehiculo();
        if (ve == null) {
            System.out.println("El vehiculo no existe");
        } else {
            System.out.println("Ingrese la Patente del vehiculo:");
            ve.setPatente(scan.next());
            System.out.println("Ingrese la Marca del vehiculo:");
            ve.setMarca(scan.next());
            System.out.println("Ingrese el Modelo del vehiculo:");
            ve.setModelo(scan.next());
            System.out.println("Ingrese el anio del vehiculo:");
            ve.setAnio(scan.nextInt());
            System.out.println("Ingrese el N° del motor del vehiculo:");
            ve.setMotor(scan.next());
            System.out.println("Ingrese el N° del chasis del vehiculo:");
            ve.setChasis(scan.next());
            System.out.println("Ingrese el color del vehiculo:");
            ve.setColor(scan.next());
            System.out.println("Ingrese el tipo del vehiculo:");
            ve.setTipo(scan.next());
        }
    }

    public void eliminarVehiculo() {
        Vehiculo ve = buscarVehiculo();
        if (ve == null) {
            System.out.println("El vehiculo no existe");
        } else {
            vehiculos.remove(ve);
        }

    }

    public Vehiculo buscarVehiculo() {
        System.out.println("Ingrese la patente del vehiculo a buscar");
        String pat = scan.next();
        for (Vehiculo vehiculo : vehiculos) {
            if (pat.equals(vehiculo.getPatente())) {
                return vehiculo;
            }
        }
        return null;
    }

    public void mostrarVehiculo() {
        Vehiculo ve = buscarVehiculo();
        if (ve == null) {
            System.out.println("El vehiculo no existe");
        } else {
            System.out.println(ve);
        }

    }

    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("Lista de Vehiculos vacia!");
        } else {
            for (Vehiculo ve : vehiculos) {
                System.out.println(ve);
            }
        }

    }
public void presioneTecla(){
          System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra =scan.next();
    }
    public void menuVehiculo() {
       
            System.out.println("-||||||- Gestion de Vehiculos existentes-||||||-");
            System.out.println("");
            System.out.println("1. Modificar Vehiculo");
            System.out.println("2. Eliminar Vehiculo");
            System.out.println("3. Mostrar lista de Vehiculos");
            System.out.println("4. Mostrar vehiculo especifico");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese una opción:");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    modificarVehiculo();
                     presioneTecla();
                    menuVehiculo();
                    break;
                case 2:
                    eliminarVehiculo();
                     presioneTecla();
                    menuVehiculo();
                    break;
                case 3:
                    mostrarVehiculos();
                    presioneTecla();
                    menuVehiculo();
                    break;
                case 4:
                    
                    mostrarVehiculo();
                    presioneTecla();
                    menuVehiculo();
                    break;
                case 5:
                   
                    
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                menuVehiculo();
                break;
            }
        

    

    }

}
