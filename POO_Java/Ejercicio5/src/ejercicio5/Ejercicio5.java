/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import Entidad.Cuenta;
import Servicio.CuentaService;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CuentaService cserv = new CuentaService();
        Cuenta c1 = cserv.crearCuenta();
        System.out.println("Ingrese una cantidad de dinero");
        cserv.ingresar(c1, scan.nextInt());
        System.out.println("Saldo actual: " + cserv.consultarSaldo(c1));
        System.out.println("Ingrese una cantidad de dinero");
        cserv.retirar(c1, scan.nextInt());
        System.out.println("Saldo actual: " + cserv.consultarSaldo(c1));
        System.out.println("Saldo retirado(20%)" + cserv.extraccionRapida(c1));
        System.out.println("Saldo actual: " + cserv.consultarSaldo(c1));
        cserv.consultarDatos(c1);
      
    }

}
