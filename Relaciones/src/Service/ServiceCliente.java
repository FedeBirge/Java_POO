/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServiceCliente {

    private ArrayList<Cliente> clientes;
    private Scanner scan;

    public ServiceCliente() {
        clientes = new ArrayList();
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public Cliente crearCliente() {
        System.out.println("Ingrese nombre del cliente");
        String nombre = scan.next();
        System.out.println("Ingrese apellido del cliente");
        String apellido = scan.next();
        System.out.println("Ingrese DNI del cliente");
        Long dni = scan.nextLong();
        System.out.println("Ingrese mail del cliente");
        String mail = scan.next();
        System.out.println("Ingrese domicilio del cliente");
        String domicilio = scan.next();
        System.out.println("Ingrese telefono del cliente");
        String telefono = scan.next();
        clientes.add(new Cliente(nombre, apellido, dni, mail, domicilio, telefono));
        return new Cliente(nombre, apellido, dni, mail, domicilio, telefono);
    }

    public void modificarCliente() {
        Cliente cliente = buscarCliente();
        if (cliente == null) {
            System.out.println("El cliente no existe");
        } else {
            System.out.println("Ingrese nuevo nombre del cliente");
            cliente.setNombre(scan.next());
            System.out.println("Ingrese nuevo apellido del cliente");
            cliente.setApellido(scan.next());
            System.out.println("Ingrese nuevo DNI del cliente");
            cliente.setDni(scan.nextLong());
            System.out.println("Ingrese nuevo mail del cliente");
            cliente.setMail(scan.next());
            System.out.println("Ingrese nuevo domicilio del cliente");
            cliente.setDomicilio(scan.next());
            System.out.println("Ingrese nuevo telefono del cliente");
            cliente.setTelefono(scan.next());

        }
    }

    public void eliminarCliente() {
        Cliente cliente = buscarCliente();
        if (cliente == null) {
            System.out.println("El cliente no existe");
        } else {
            clientes.remove(cliente);
        }

    }

    public Cliente buscarCliente() {
        System.out.println("Ingrese el DNI del cliente a buscar");
        String dni = scan.next();

        for (Cliente cliente : clientes) {
            if (dni.equals(cliente.getDni())) {
                return cliente;
            }

        }
        return null;

    }

    public void mostrarCliente() {
        Cliente cliente = buscarCliente();
        if (cliente == null) {
            System.out.println("El cliente no existe");
        } else {
            System.out.println(cliente);
        }

    }

    public void mostrarClientes() {
        if (clientes.isEmpty()){
            System.out.println("Lista de Clientes vacia!");  
        }
        else{
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        }

    }
    public void presioneTecla(){
          System.out.println("");
        System.out.println("Ingrese una LETRA y presione ENTER para continuar...");
        String letra =scan.next();
    }

    public void menuCliente() {
        boolean salir = false;
        while (!salir) {
            System.out.println("----------Gestion de Clientes existentes----------");
            System.out.println("");
            System.out.println("1. Modificar Cliente");
            System.out.println("2. Eliminar Cliente");
            System.out.println("3. Mostrar lista de Clientes");
            System.out.println("4. Mostrar cliente especifico");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese una opción:");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    modificarCliente();
                     presioneTecla();
                    break;
                case 2:
                    eliminarCliente();
                     presioneTecla();
                    break;
                case 3:
                    mostrarClientes();
                    presioneTecla();
                    break;
                case 4:
                    
                    mostrarCliente();
                    presioneTecla();
                    break;
                case 5:
                   
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                
            }
        }

    }
}
