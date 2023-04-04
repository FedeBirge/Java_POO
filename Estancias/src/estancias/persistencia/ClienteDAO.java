package estancias.persistencia;

import estancias.entidades.Casa;
import estancias.entidades.Cliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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

    public  Map<Cliente, Casa> buscarClientePorOp5() throws Exception {
        try {

            String sql = "SELECT DISTINCT c.*, ca.* FROM clientes c\n"
                    + "JOIN estancias e ON c.id_cliente = e.id_cliente\n"
                    + "JOIN casas ca ON e.id_casa= ca.id_casa";

            consultarBase(sql);
      
            Cliente cliente = null;
            Casa casa = null;
            Map<Cliente, Casa> mapa = new HashMap<>();
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
                casa = new Casa();
                casa.setId_casa(resultado.getInt(9));
                casa.setCalle(resultado.getString(10));
                casa.setNumero(resultado.getInt(11));
                casa.setCodigo_postal(resultado.getString(12));
                casa.setCiudad(resultado.getString(13));
                casa.setPais(resultado.getString(14));
                casa.setFecha_desde(resultado.getDate(15).toLocalDate());
                casa.setFecha_hasta(resultado.getDate(16).toLocalDate());
                casa.setTiempo_minimo(resultado.getInt(17));
                casa.setTiempo_maximo(resultado.getInt(18));
                casa.setPrecio_habitacion(resultado.getFloat(19));
                casa.setTipo_vivienda(resultado.getString(20));
                mapa.put(cliente, casa);

            }
            desconectarBase();
            return mapa;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    //    public Cliente buscarClientePorCorreoElectronico(String correoElectronico) throws Exception {
//    }
}
