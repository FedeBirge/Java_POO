package libreria.persistencia;

import java.util.List;
import libreria.entidades.Cliente;

/**
 *
 * @author feder
 */
public class ClienteDAO extends DAO{
        public void guardarCliente(Cliente cliente) {
        guardar(cliente);
    }

    public void eliminarCliente(Long isbn) throws Exception {
        Cliente cliente = buscarPorId(isbn);    
           eliminar(cliente);         
       
    }

    public List<Cliente> listarClientes() throws Exception {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT l FROM Cliente l ").getResultList();
        desconectar();
        return clientes;
    }

    public Cliente buscarPorId(Long id) throws Exception {
        conectar();
        Cliente cliente = null;
        cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.id LIKE :id").setParameter("id", id.toString()).getSingleResult();
        desconectar();
        return cliente;
    }
     public Cliente buscarPorDNI(Long dni) throws Exception {
        conectar();
        Cliente cliente = null;
        cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.doc = :doc").setParameter("doc", dni).getSingleResult();
        desconectar();
        return cliente;
    }
     public Cliente buscarPorNombre(String nombre) throws Exception {
        conectar();
        Cliente cliente = null;
        cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return cliente;
    }
     public Cliente buscarPorAutor(String nombre) throws Exception {
        conectar();
        Cliente cliente = null;
        cliente = (Cliente) em.createQuery("SELECT a FROM Cliente a WHERE a.autor.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return cliente;
    }
        public Cliente buscarPorEditorial(String nombre) throws Exception {
        conectar();
        Cliente cliente = null;
        cliente = (Cliente) em.createQuery("SELECT a FROM Cliente a WHERE a.editorial.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return cliente;
    }
    
}
