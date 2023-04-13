/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author feder
 */
public class LibroDAO extends DAO<Libro>{
    
    
    public void guardarLibro(Libro libro) {
        guardar(libro);
    }

    public void eliminarLibro(Long isbn) throws Exception {
        Libro libro = buscarPorId(isbn);    
//        eliminar(libro);
          libro.setAlta(Boolean.FALSE);
          editar(libro);
    }

    public List<Libro> listarLibros() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l ").getResultList();
        desconectar();
        return libros;
    }

    public Libro buscarPorId(Long isbn) throws Exception {
        conectar();
        Libro libro = null;
        libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn").setParameter("isbn", isbn.toString()).getSingleResult();
        desconectar();
        return libro;
    }
     public Libro buscarPorNombre(String nombre) throws Exception {
        conectar();
        Libro libro = null;
        libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :titulo").setParameter("titulo", nombre).getSingleResult();
        desconectar();
        return libro;
    }
     public Libro buscarPorAutor(String nombre) throws Exception {
        conectar();
        Libro libro = null;
        libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.autor.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return libro;
    }
        public Libro buscarPorEditorial(String nombre) throws Exception {
        conectar();
        Libro libro = null;
        libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.editorial.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return libro;
    }
}
