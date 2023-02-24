/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author feder
 */
// se indica si es privado o no, así como la cantidad de metros
//cuadrados que ocupa
public abstract class HotelExtra extends Alojamiento {
    protected Boolean privado;
    protected Integer mts2;
    protected Integer precioHabi;

    public HotelExtra() {
    }

    public HotelExtra(Boolean privado, Integer mts2, Integer precioHabi, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mts2 = mts2;
        this.precioHabi = precioHabi;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getMts2() {
        return mts2;
    }

    public void setMts2(Integer mts2) {
        this.mts2 = mts2;
    }

    public Integer getPrecioHabi() {
        return precioHabi;
    }

    public void setPrecioHabi(Integer precioHabi) {
        this.precioHabi = precioHabi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.privado);
        hash = 61 * hash + Objects.hashCode(this.mts2);
        hash = 61 * hash + Objects.hashCode(this.precioHabi);
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
        final HotelExtra other = (HotelExtra) obj;
        if (!Objects.equals(this.privado, other.privado)) {
            return false;
        }
        if (!Objects.equals(this.mts2, other.mts2)) {
            return false;
        }
        return Objects.equals(this.precioHabi, other.precioHabi);
    }

  
    
    
}
