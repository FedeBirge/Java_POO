/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
//indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios 
//y si posee o no campo deportivo.
public final class Residencia extends HotelExtra{
    private Integer cantH;
    private Boolean descuento;
    private Boolean deportivo;

    public Residencia() {
    }

    public Residencia(Integer cantH, Boolean descuento, Boolean deportivo, Boolean privado, Integer mts2, Integer precioHabi, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, precioHabi, nombre, direccion, localidad, gerente);
        this.cantH = cantH;
        this.descuento = descuento;
        this.deportivo = deportivo;
    }

    public Integer getCantH() {
        return cantH;
    }

    public void setCantH(Integer cantH) {
        this.cantH = cantH;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public Boolean getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Boolean deportivo) {
        this.deportivo = deportivo;
    }

    @Override
    public String toString() {
        return "Residencia " +nombre+", "+ direccion+", "+ localidad+", "+ gerente
                + "\nPropietario Privado "+privado+". Metros cuadros totales: " + mts2+". Precio Habitacion "+ precioHabi 
                + "\nHabitaciones: " + cantH + " , Descuento a gremios: " + descuento + ", Campo deportivo: " + deportivo;
    }
    
    
    
}
