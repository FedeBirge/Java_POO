/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author feder
 */
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
//numero de páginas.
public class Libro {

    private String ISBN;
    private String Titulo;    
    private String Autor;
    private String NPaginas;
    
    public Libro(){
        
    }

    public Libro(String ISBN, String Titulo, String Autor, String NPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NPaginas = NPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getNPaginas() {
        return NPaginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNPaginas(String NPaginas) {
        this.NPaginas = NPaginas;
    }
    
 
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NPaginas=" + NPaginas + '}';
    }
    
    

            
                    
    
}
