/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.util.Objects;

/**
 *
 * @author feder
 */
//Se registrarán y podrán consultar las cuotas generadas en cada póliza.
//Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
//cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
public class Cuota implements Comparable<Cuota>{
    private Integer numero;
    private Float monto;
    private Boolean pagada;
    private LocalDate vence;


    public Cuota() {
       pagada=false;
    }

    public Cuota(Integer numero, Float monto, Boolean pagada, LocalDate vence) {
        this.numero = numero;
        this.monto = monto;
        this.pagada = pagada;
        this.vence = vence;
        
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Boolean getPagada() {
        return pagada;
    }

    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getVence() {
        return vence;
    }

    public void setVence(LocalDate vence) {
        this.vence = vence;
    }


   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.numero);
        hash = 97 * hash + Objects.hashCode(this.monto);
        hash = 97 * hash + Objects.hashCode(this.pagada);
        hash = 97 * hash + Objects.hashCode(this.vence);
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuota other = (Cuota) obj;
       
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.monto, other.monto)) {
            return false;
        }
        if (!Objects.equals(this.pagada, other.pagada)) {
            return false;
        }
        return Objects.equals(this.vence, other.vence);
    }

    @Override
    public String toString() {
        return "cuota N° " + numero + ", monto: " + monto + ", "
                + "pagada " + pagada + ", vence " 
                + vence.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }

    @Override
    public int compareTo(Cuota t) {
        return this.numero.compareTo(t.getNumero());
    }
    
    
}
