/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;

/**
 *
 * @author feder
 */
public class Poliza {
//    Se registrará una póliza, donde se guardará los datos tanto de un
//vehículo, como los datos de un solo cliente. 
//os datos incluidos en ella son: número depóliza, fecha de inicio y fin de la póliza,
//cantidad de cuotas, forma de pago, monto totalasegurado, 
//incluye granizo, monto máximo granizo, tipo de cobertura (total, contra terceros, etc.). 
//Nota: prestar atención al principio de este enunciado y pensar en las
//relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
//muchos a uno o de muchos a muchos.
    private Integer numero;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Integer cuotas;
    private String formaPago;
    private Long montoAsegurado;
    private Boolean granizo;
    private Integer montoGranizo;
    private String tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private TreeSet<Cuota> plan;  

    public Poliza() {
//        fechaFin.format(DateTimeFormatter.ofPattern(" dd MMM yyyy"));
//        fechaInicio.format(DateTimeFormatter.ofPattern(" dd MMM yyyy"));
    }
    
    public Poliza(Integer numero, LocalDate fechaInicio, LocalDate fechaFin, Integer cuotas, String formaPago, Long montoAsegurado, Boolean granizo, Integer montoGranizo, String tipoCobertura, Cliente cliente, Vehiculo vehiculo, TreeSet<Cuota> plan) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.plan = plan;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Long getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(Long montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Integer getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(Integer montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public TreeSet<Cuota> getPlan() {
        return plan;
    }

    public void setPlan(TreeSet<Cuota> plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Poliza N° " + numero + ", vigencia desde" 
                + fechaInicio.format(DateTimeFormatter.ofPattern(" dd MMM yyyy")) 
                + " hasta" + fechaFin.format(DateTimeFormatter.ofPattern(" dd MMM yyyy")) 
                + ".\n"+ cuotas + " cuotas por " + formaPago + ", Monto Total Asegurado: " + montoAsegurado 
                + ".\nCobertura Granizo " + granizo + ", Monto por Granizo: " + montoGranizo + ", Cobertura Tipo " + tipoCobertura 
                + ",\nCliente=" + cliente 
                + ",\nVehiculo=" + vehiculo 
                + ",\nplan=" + plan + " .";
    }
    
            
    
}
