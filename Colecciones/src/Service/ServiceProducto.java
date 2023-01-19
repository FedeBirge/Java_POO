/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author feder
 */
//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
public class ServiceProducto {

    Map<String, Integer> productos;
    Scanner scan;

    public ServiceProducto() {
        this.productos = new HashMap();
        this.scan = new Scanner(System.in);
    }

    public void ingresarProductos() {

        
        productos.put("Alfajor", 140);
        productos.put("Galletas", 10);
        productos.put("Caramelo", 4);
        productos.put("Chicle", 5);
        productos.put("Chupetin", 8);

        do {
            Producto p = new Producto();
            System.out.println("Ingrese el nombre del producto:");
            p.setNombre(scan.next());
            System.out.println("Ingrese su precio:");
            p.setPrecio(scan.nextInt());
            productos.put(p.getNombre(), p.getPrecio());
            System.out.println("Desea ingresar otro producto?");
            String res = scan.next();
            if (res.equals("N")) {
                break;
            }

        } while (true);

    }

    public void modificarProducto() {
        System.out.println("Ingrese el nombre del producto para modificar su precio");
        String nombre = scan.next();
        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el precio actualizado");
            Integer valor = scan.nextInt();

            for (Map.Entry<String, Integer> prod : productos.entrySet()) {
                String key = prod.getKey();
                if (key.equals(nombre)) {
                    prod.setValue(valor);
                }
            }
        } else {
            System.out.println("El producto no existe");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombre = scan.next();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        }
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Producto: " + key.hashCode() + " .Precio: " + value);

        }
    }

    public void menu() {
        boolean salir = false;
        do {

            System.out.println("-------------Menu Productos-------------");
            System.out.println("1. Ingresar productos");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese una opcion:");

            int op = scan.nextInt();
            switch (op) {
                case 1:
                    ingresarProductos();
                    break;
                case 2:
                    modificarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion incorrecta");

            }

        } while (!salir);

    }

}
