package libreria.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author feder
 */
@Entity
public class Prestamo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    @OneToOne
    private Libro libro;
    @OneToOne
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(Integer id, LocalDate fechaPrestamo, LocalDate fechaDevolucion, Libro libro, Cliente cliente) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.fechaPrestamo);
        hash = 67 * hash + Objects.hashCode(this.fechaDevolucion);
        hash = 67 * hash + Objects.hashCode(this.libro);
        hash = 67 * hash + Objects.hashCode(this.cliente);
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
        final Prestamo other = (Prestamo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fechaPrestamo, other.fechaPrestamo)) {
            return false;
        }
        if (!Objects.equals(this.fechaDevolucion, other.fechaDevolucion)) {
            return false;
        }
        if (!Objects.equals(this.libro, other.libro)) {
            return false;
        }
        return Objects.equals(this.cliente, other.cliente);
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", libro=" + libro + ", cliente=" + cliente + '}';
    }
    
}
