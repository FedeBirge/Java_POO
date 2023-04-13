/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Prestamo;

/**
 *
 * @author feder
 */
public class PrestamoDAO extends DAO {
        public void guardarPrestamo(Prestamo prestamo) {
        guardar(prestamo);
    }

    public void eliminarPrestamo(Long isbn) throws Exception {
        Prestamo prestamo = buscarPorId(isbn);    
     eliminar(prestamo);     
    }

    public List<Prestamo> listarPrestamos() throws Exception {
        conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p ").getResultList();
        desconectar();
        return prestamos;
    }

    public Prestamo buscarPorId(Long id) throws Exception {
        conectar();
        Prestamo prestamo = null;                               
        prestamo = (Prestamo) em.createQuery("SELECT p FROM Prestamo p WHERE p.id LIKE :id").setParameter("id", id.toString()).getSingleResult();
        desconectar();
        return prestamo;
    }
      public List<Prestamo> buscarPrestamosDNICliente(Long doc) throws Exception {
        conectar(); 
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.doc LIKE :doc ").setParameter("doc", doc.toString()).getResultList();
        desconectar();
        return prestamos;
    }
//     public Prestamo buscarPorNombre(String nombre) throws Exception {
//        conectar();
//        Prestamo prestamo = null;
//        prestamo = (Prestamo) em.createQuery("SELECT p FROM Prestamo p WHERE p.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
//        desconectar();
//        return prestamo;
//    }
//     public Prestamo buscarPorAutor(String nombre) throws Exception {
//        conectar();
//        Prestamo prestamo = null;
//        prestamo = (Prestamo) em.createQuery("SELECT p FROM Prestamo p WHERE p.autor.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
//        desconectar();
//        return prestamo;
//    }
//        public Prestamo buscarPorEditorial(String nombre) throws Exception {
//        conectar();
//        Prestamo prestamo = null;
//        prestamo = (Prestamo) em.createQuery("SELECT a FROM Prestamo a WHERE a.editorial.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
//        desconectar();
//        return prestamo;
//    } 
    
    
}
