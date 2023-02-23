/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
//Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas
public class Hotel5 extends Hotel4 {

    public Integer salones;
    public Integer suites;
    public Integer limosinas;

    public Hotel5() {
    }

    public Hotel5(Integer salones, Integer suites, Integer limosinas, String gym, String nombreResto, Integer capaResto, Integer cantHabi, Integer camas, Integer pisos, Integer precioHabi, String nombre, String direccion, String localidad, String gerente) {
        super(gym, nombreResto, capaResto, cantHabi, camas, pisos, precioHabi, nombre, direccion, localidad, gerente);
        this.limosinas = limosinas;
        this.salones = salones;
        this.suites = suites;
      
   
    }

    public Integer getSalones() {
        return salones;
    }

    public void setSalones(Integer salones) {
        this.salones = salones;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
    }

       
    @Override
    public int calcularPrecio() {
        this.precioHabi = super.calcularPrecio()+valLimo();
        return this.precioHabi;
    }
    private Integer valLimo() {
           System.out.println(this.limosinas);

           return this.limosinas*15;
       }
    @Override
    public String toString() {
        return "Hotel 5 estrellas: " + nombre + ", " + direccion + ", " + localidad + ", " + gerente
                + "\nHabitaciones: " + cantHabi + ". Camas: " + camas + ". Pisos: " + pisos + ". Precio de habitacion " + precioHabi
                + "\nGymnasio: " + gym + ", Resto " + nombreResto + ", capacidad: " + capaResto
                + "\nSalones de conferencia: " + salones + ", Suites: " + suites + ", Limosinas: " + limosinas;

    }

}
