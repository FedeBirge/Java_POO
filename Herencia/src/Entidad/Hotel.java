/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
//: Cantidad de Habitaciones, Número de Camas, Cantidad de
//Pisos, Precio de Habitaciones
public abstract class Hotel extends Alojamiento{
    protected Integer cantHabi;
    protected Integer camas;
    protected Integer pisos;
    protected Integer precioHabi;

    public Hotel() {
    }

    public Hotel(Integer cantHabi, Integer camas, Integer pisos, Integer precioHabi, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabi = cantHabi;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHabi = precioHabi;
    }

    public Integer getCantHabi() {
        return cantHabi;
    }

    public void setCantHabi(Integer cantHabi) {
        this.cantHabi = cantHabi;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getPrecioHabi() {
        return precioHabi;
    }

    public void setPrecioHabi(Integer precioHabi) {
        this.precioHabi = precioHabi;
    }
    protected abstract int calcularPrecio();
        
    
}
