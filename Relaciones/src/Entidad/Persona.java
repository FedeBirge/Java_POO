
package Entidad;

/**
 *
 * @author feder
 */
//clase Persona con atributos: nombre, apellido, edad, documento y Perro.
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private DNI dni;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, DNI dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ",\n perro=" + perro + '}';
    }

    
    
    
}
