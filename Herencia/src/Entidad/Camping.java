/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
//la capacidad máxima de carpas, la cantidad de baños
//disponibles y si posee o no un restaurante dentro de las instalaciones.
public class Camping extends HotelExtra{
    public Integer carpas;
    public Integer banos;
    public Boolean resto;

    public Camping() {
    }

    public Camping(Integer carpas, Integer banos, Boolean resto, Boolean privado, Integer mts2, Integer precioHabi, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, precioHabi, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banos = banos;
        this.resto = resto;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public Integer getBanos() {
        return banos;
    }

    public void setBanos(Integer banos) {
        this.banos = banos;
    }

    public Boolean getResto() {
        return resto;
    }

    public void setResto(Boolean resto) {
        this.resto = resto;
    }

    @Override
    public String toString() { 
        return "Camping "+nombre+", "+ direccion+", "+ localidad+", "+ gerente
                + "\nPropietario Privado "+privado+". Metros cuadros totales:" + mts2+". Precio Habitacion"+ precioHabi
                + "\nCapacidad de carpas: " + carpas + ". Cantidad de banos: " + banos + ". Restaurante en instalaciones: " + resto;
    }
    
    
}
