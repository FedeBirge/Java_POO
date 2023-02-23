/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
//Gimnasio, nombre del Restaurante, Capacidad del Restaurante,
public class Hotel4 extends Hotel {

    public String gym;
    public String nombreResto;
    public Integer capaResto;

    public Hotel4() {
    }

    public Hotel4(String gym, String nombreResto, Integer capaResto, Integer cantHabi, Integer camas, Integer pisos, Integer precioHabi, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabi, camas, pisos, precioHabi, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nombreResto = nombreResto;
        this.capaResto = capaResto;

    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public Integer getCapaResto() {
        return capaResto;
    }

    public void setCapaResto(Integer capaResto) {
        this.capaResto = capaResto;
    }

   
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + 
//(valor agregado por restaurante) + (valoragregado por gimnasio) + 

   
    @Override
    public int calcularPrecio() {
        precioHabi = 50 + camas + valResto() + valGym();
   
        return precioHabi;
    }
    private Integer valResto() {
           if (capaResto < 30) {
               return 10;
           } else {
               if (capaResto < 50) {
                   return 30;
               } else {
                   return 50;
               }
           }
       }

    private Integer valGym() {
        
        if (gym.equalsIgnoreCase("a")) {
            return 50;
        } else {
            return 30;
        }

    }
    @Override
    public String toString() {
        return "Hotel 4 estrellas: " + nombre + ", " + direccion + ", " + localidad + ", Gerencia " + gerente
                + "\nHabitaciones: " + cantHabi + ". Camas: " + camas + ". Pisos: " + pisos + ". Precio de habitacion " + precioHabi
                + "\nGimnasio Tipo: " + gym + ", Resto " + nombreResto + ", capacidad: " + capaResto;
    }

}
