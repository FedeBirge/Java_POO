package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author feder
 */
public class AutorDAO extends DAO<Autor>{
    public void guardarAutor(Autor autor) {
        guardar(autor);
    }

    public void eliminarAutor(Integer id) throws Exception {
        Autor autor = buscarPorId(id);
//        eliminar(autor);
        autor.setAlta(Boolean.FALSE);
        editar(autor);
    }

    public List<Autor> listarAutores() throws Exception {
        conectar();
        List<Autor> autors = em.createQuery("SELECT a FROM Autor a ").getResultList();
        desconectar();
        return autors;
    }

    public Autor buscarPorId(Integer id) throws Exception {
        conectar();
        Autor autor = null;
        autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id LIKE :id").setParameter("id", id).getSingleResult();
        desconectar();
        return autor;
    }
    public Autor buscarPorNombre(String nombre) throws Exception {
        conectar();
        Autor autor = null;
        autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }
    
}
