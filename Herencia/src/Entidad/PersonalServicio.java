/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author feder
 */
//Sobre el personal de servicio, hay que conocer a qué sección están asignados
//(biblioteca, decanato, secretaría, ...). 
public class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion) {
        this.seccion = seccion;
    }

    public PersonalServicio(String seccion, LocalDate incorpora, Integer despacho) {
        super(incorpora, despacho);
        this.seccion = seccion;
    }

    public PersonalServicio(String seccion, LocalDate incorpora, Integer despacho, String nombre, String apellido, Long dni, String estCivil) {
        super(incorpora, despacho, nombre, apellido, dni, estCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Personal de Servicio--> "+nombre+" "+ apellido+", "+ dni +", "+ estCivil 
                +"\n Fecha incorporacion: "+ incorpora+" N° de despacho: "+ despacho+". Seccion --> " + seccion;
    }
    
    
    
}
