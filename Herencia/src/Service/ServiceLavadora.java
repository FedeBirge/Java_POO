/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Lavadora;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public final class ServiceLavadora extends ServiceElectrodomestico {

    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
//     Método crearLavadora (): este método llama a crearElectrodomestico() de la clase 
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
//el atributo propio de la lavadora

    public Lavadora crearLavadora() {
        Lavadora lav = new Lavadora();
        super.crearElectrodomestico(lav);
        System.out.println("Ingrese la carga de la lavadora");
        lav.setCarga(scan.nextInt());
        return lav;
    }

//     Método precioFinal(): este método será heredado y se le sumará la siguiente 
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la 
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al 
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos 
//visto en la clase Electrodoméstico también deben afectar al precio.
    public void preciofinal(Lavadora lav) {
        super.preciofinal(lav);
        if (lav.getCarga() > 30) {
            lav.setPrecio(lav.getPrecio() + 500f);
        }

    }

}
