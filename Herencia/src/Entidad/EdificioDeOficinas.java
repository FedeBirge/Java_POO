/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
public final class EdificioDeOficinas extends Edificio {
    
    private Integer oficinas;
    private Integer personas;
    private Integer pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer oficinas, Integer personas, Integer pisos) {
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(Integer oficinas, Integer personas, Integer pisos, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public Integer getOficinas() {
        return oficinas;
    }

    public void setOficinas(Integer oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }
    public void cantPersonas(){
        System.out.println("Cantidad de personas por piso: "+ this.personas);
     
        System.out.println("Cantidad total de personas en edificio: "+ (this.personas*this.pisos));
    }
    

    @Override
    public int calcularSuperficie() {
         return  2*(alto*ancho+alto*largo+ancho*largo)*pisos;
    }

    @Override
    public int calcularVolumen() {
               return alto*ancho*largo*pisos;
    }
    
    
}
