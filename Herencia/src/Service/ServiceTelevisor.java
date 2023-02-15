/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public final class ServiceTelevisor extends ServiceElectrodomestico {

    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
//    Método precioFinal(): este método será heredado y se le sumará la siguiente 
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará 
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
//también deben afectar al precio

    public void precioFinal(Televisor tv) {
        super.preciofinal(tv);
        if (tv.getResolucion() > 40) {
            tv.setPrecio(tv.getPrecio() * 1.3f);
        }
        if (tv.getSintonizador()) {
            tv.setPrecio(tv.getPrecio() + 500f);
        }
    }

    public Televisor crearTelevisor() {
        Televisor tv = new Televisor();
        super.crearElectrodomestico(tv);
        System.out.println("Ingrese la resolucion del TV: ");
        tv.setResolucion(scan.nextInt());
        System.out.println("Indique si tiene sintonizador TDT(SI/NO) ");
        String res = scan.next();
        if (res.equalsIgnoreCase("SI")) {
            tv.setSintonizador(Boolean.TRUE);
        } else {
            tv.setSintonizador(Boolean.FALSE);
        }
        precioFinal(tv);
        return tv;
    }
}
