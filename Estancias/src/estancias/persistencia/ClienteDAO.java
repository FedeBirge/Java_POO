package estancias.persistencia;

import estancias.entidades.Cliente;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author feder
 */
public final class ClienteDAO extends DAO {

    public void guardarCliente(Cliente cliente) throws Exception {
        try {
            if (cliente == null) {
                throw new Exception("Debe indicar el cliente");
            }

            String sql = "INSERT INTO clientes (nombre, calle, numero, "
                    + "codigo_postal, ciudad, pais, email)"
                    + "VALUES ( '" + cliente.getNombre() + "' , '" + cliente.getCalle() + "' , '"
                    + cliente.getNumero() + "' , '" + cliente.getCodigo_postal() + "' , '"
                    + cliente.getCiudad() + "' , '" + cliente.getPais() + "' , '" + cliente.getEmail() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    public void modificarCliente(Cliente cliente) throws Exception {
        try {
            if (cliente == null) {
                throw new Exception("Debe indicar el cliente que desea modificar");
            }

            String sql = "UPDATE clientes SET " // COMPLETAR SENTENCIA
                    + "clave = '" + cliente.getNombre() + "' WHERE id_cliente = '" + cliente.getId_cliente() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarClienteId(int id) throws Exception {
        try {

            String sql = "DELETE FROM clientes WHERE id_cliente = '" + id + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    public Cliente buscarClientePorId(int id) throws Exception {
        try {

            String sql = "SELECT * FROM clientes "
                    + " WHERE id = '" + id + "'";

            consultarBase(sql);

            Cliente cliente = null;
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigo_postal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));

            }
            desconectarBase();
            return cliente;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Cliente> listarClientes() throws Exception {
        try {
            String sql = "SELECT * FROM clientes ";

            consultarBase(sql);

            Cliente cliente = null;
            Collection<Cliente> clientes = new ArrayList();
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigo_postal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
                clientes.add(cliente);

            }
            desconectarBase();
            return clientes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    

    //    public Cliente buscarClientePorCorreoElectronico(String correoElectronico) throws Exception {
//    }
}
