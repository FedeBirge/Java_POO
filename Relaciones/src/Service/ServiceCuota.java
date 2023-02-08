/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Cuota;
import Entidad.Poliza;
import java.time.LocalDate;
import java.util.TreeSet;

/**
 *
 * @author feder
 */
public class ServiceCuota {
    TreeSet<Cuota> plan = new TreeSet();  
    public void generarPlan(){
        System.out.println("");
        for (int i = 1; i < 12; i++) {
            Cuota cuo = new Cuota();
            cuo.setNumero(i);
            cuo.setMonto(1000F);
            LocalDate fecha = LocalDate.now();
            cuo.setVence(fecha.plusMonths(i));
           plan.add(cuo);
        }
        //pol.setPlan(plan);
        for (Cuota cuota : plan) {
            System.out.println(cuota);
        }
    }
    
}
