package estancias.entidades;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author feder
 */
public class Casa implements Comparable<Casa> {

    private Integer id_casa;
    private String calle;
    private int numero;
    private String codigo_postal;
    private String ciudad;
    private String pais;
    private LocalDate fecha_desde;
    private LocalDate fecha_hasta;
    private int tiempo_minimo;
    private int tiempo_maximo;
    private float precio_habitacion;
    private String tipo_vivienda;

    public Casa() {
    }

    public Casa(int id_casa, String calle, int numero, String codigo_postal, String ciudad, String pais, LocalDate fecha_desde, LocalDate fecha_hasta, int tiempo_minimo, int tiempo_maximo, float precio_habitacion, String tipo_vivienda) {
        this.id_casa = id_casa;
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.tiempo_minimo = tiempo_minimo;
        this.tiempo_maximo = tiempo_maximo;
        this.precio_habitacion = precio_habitacion;
        this.tipo_vivienda = tipo_vivienda;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(LocalDate fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public LocalDate getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(LocalDate fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public int getTiempo_minimo() {
        return tiempo_minimo;
    }

    public void setTiempo_minimo(int tiempo_minimo) {
        this.tiempo_minimo = tiempo_minimo;
    }

    public int getTiempo_maximo() {
        return tiempo_maximo;
    }

    public void setTiempo_maximo(int tiempo_maximo) {
        this.tiempo_maximo = tiempo_maximo;
    }

    public float getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(float precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id_casa);
        hash = 89 * hash + Objects.hashCode(this.calle);
        hash = 89 * hash + this.numero;
        hash = 89 * hash + Objects.hashCode(this.codigo_postal);
        hash = 89 * hash + Objects.hashCode(this.ciudad);
        hash = 89 * hash + Objects.hashCode(this.pais);
        hash = 89 * hash + Objects.hashCode(this.fecha_desde);
        hash = 89 * hash + Objects.hashCode(this.fecha_hasta);
        hash = 89 * hash + this.tiempo_minimo;
        hash = 89 * hash + this.tiempo_maximo;
        hash = 89 * hash + Float.floatToIntBits(this.precio_habitacion);
        hash = 89 * hash + Objects.hashCode(this.tipo_vivienda);
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
        final Casa other = (Casa) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.tiempo_minimo != other.tiempo_minimo) {
            return false;
        }
        if (this.tiempo_maximo != other.tiempo_maximo) {
            return false;
        }
        if (Float.floatToIntBits(this.precio_habitacion) != Float.floatToIntBits(other.precio_habitacion)) {
            return false;
        }
        if (!Objects.equals(this.calle, other.calle)) {
            return false;
        }
        if (!Objects.equals(this.codigo_postal, other.codigo_postal)) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.tipo_vivienda, other.tipo_vivienda)) {
            return false;
        }
        if (!Objects.equals(this.id_casa, other.id_casa)) {
            return false;
        }
        if (!Objects.equals(this.fecha_desde, other.fecha_desde)) {
            return false;
        }
        return Objects.equals(this.fecha_hasta, other.fecha_hasta);
    }

    @Override
    public String toString() {
        return "Casa ID: " + id_casa + ", " + calle + " " + numero + ", C.P " + codigo_postal
                + ". " + ciudad + ", " + pais + ",\nDisponible desde " + fecha_desde + ", Disponible hasta " + fecha_hasta
                + ".\nPeriodo mínimo de estadía: " + tiempo_minimo + " dias, máximo " + tiempo_maximo + " dias."
                + "\nPrecio habitacion por día :" + precio_habitacion + ", vivienda tipo: " + tipo_vivienda;
    }

    @Override
    public int compareTo(Casa t) {
        return this.id_casa.compareTo(t.getId_casa());
    }

}
