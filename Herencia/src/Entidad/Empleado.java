/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
//incorporación a la facultad y qué número de despacho tienen asignado. 
public abstract class Empleado extends Persona {
    protected LocalDate incorpora;
    protected Integer despacho;

    public Empleado() {
    }

    public Empleado(LocalDate incorpora, Integer despacho) {
        this.incorpora = incorpora;
        this.despacho = despacho;
    }

    public Empleado(LocalDate incorpora, Integer despacho, String nombre, String apellido, Long dni, String estCivil) {
        super(nombre, apellido, dni, estCivil);
        this.incorpora = incorpora;
        this.despacho = despacho;
    }

    public LocalDate getIncorpora() {
        return incorpora;
    }

    public void setIncorpora(LocalDate incorpora) {
        this.incorpora = incorpora;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }
    public void cambiarDespacho(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        if(this.despacho==null){
            System.out.println("La persona no tiene despacho asignado..");
        }
        else{
            System.out.println("El despacho actual es: "+this.despacho);
        }
        System.out.println("Ingrese el nuevo N° de despacho: ");
        this.despacho= scan.nextInt();
    }
    @Override
    public String toString() {
        return "Fecha de incorporacion --> " + incorpora + ",N° de despacho" + despacho;
    }
    
    
}
