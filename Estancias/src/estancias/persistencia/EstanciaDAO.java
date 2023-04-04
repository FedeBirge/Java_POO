package estancias.persistencia;

import estancias.entidades.Casa;
import estancias.entidades.Cliente;
import estancias.entidades.Estancia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author feder
 */
public final class EstanciaDAO extends DAO {

    public void guardarEstancia(Estancia estancia) throws Exception {
        try {
            if (estancia == null) {
                throw new Exception("Debe indicar la estancia");
            }

            String sql = "INSERT INTO estancias (id_estancia, id_casa, nombre_huesped, "
                    + "fecha_desde, fecha_hasta)"
                    + "VALUES ( '" + estancia.getId_estancia() + "' , '" + estancia.getId_casa() + "' , '"
                    + estancia.getNombre_huesped() + "' , '" + estancia.getFecha_desde() + "' , '" + estancia.getFecha_hasta() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarEstancia(Estancia estancia) throws Exception {

        try {
            if (estancia == null) {
                throw new Exception("Debe indicar la estancia que desea modificar");
            }

            String sql = "UPDATE estancias SET "
                    + "id_estancia = '" + estancia.getId_estancia()
                    + ",id_casa = '" + estancia.getId_casa()
                    + ",nombre_huesped = '" + estancia.getNombre_huesped()
                    + ",fecha_desde = '" + estancia.getFecha_desde()
                    + "',fecha_hasta='" + estancia.getFecha_hasta()
                    + "' WHERE id_estamcia = '" + estancia.getId_estancia() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarEstancia(int id) throws Exception {
        try {

            String sql = "DELETE FROM estancias WHERE id_estancia = '" + id + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Estancia buscarEstanciaPorId(Integer id) throws Exception {
        try {
            String sql = "SELECT * FROM estancias "
                    + " WHERE id = '" + id + "'";

            consultarBase(sql);

            Estancia estancia = null;
            while (resultado.next()) {
                estancia = new Estancia();
                estancia.setId_estancia(resultado.getInt(1));
                estancia.setId_estancia(resultado.getInt(2));
                estancia.setId_casa(resultado.getInt(3));
                estancia.setNombre_huesped(resultado.getString(4));
                estancia.setFecha_desde(resultado.getDate(5).toLocalDate());
                estancia.setFecha_hasta(resultado.getDate(6).toLocalDate());

            }
            desconectarBase();
            return estancia;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Collection<Estancia> listarEstancias() throws Exception {

        try {
            String sql = "SELECT * FROM estancias ";

            consultarBase(sql);

            Estancia estancia = null;
            Collection<Estancia> estancias = new ArrayList();
            while (resultado.next()) {
                estancia = new Estancia();
                estancia.setId_estancia(resultado.getInt(1));
                estancia.setId_cliente(resultado.getInt(2));
                estancia.setId_casa(resultado.getInt(3));
                estancia.setNombre_huesped(resultado.getString(4));
                estancia.setFecha_desde(resultado.getDate(5).toLocalDate());
                estancia.setFecha_hasta(resultado.getDate(6).toLocalDate());
                estancias.add(estancia);

            }
            desconectarBase();
            return estancias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }

    public Map<Estancia, Map<Cliente, Casa>> listarEstanciasOp6() throws Exception {

        try {
            String sql = "SELECT e.*, c.nombre, c.pais, c.ciudad, ca.* FROM estancias e\n"
                    + "JOIN clientes c ON e.id_cliente=c.id_cliente\n"
                    + "JOIN casas ca ON e.id_casa=ca.id_casa";

            consultarBase(sql);

            Estancia estancia = null;
            Casa casa = null;
            Cliente cliente = null;
            Map<Estancia, Map<Cliente, Casa>> mapa = new HashMap<>();
            while (resultado.next()) {
                estancia = new Estancia();
                estancia.setId_estancia(resultado.getInt(1));
                estancia.setId_cliente(resultado.getInt(2));
                estancia.setId_casa(resultado.getInt(3));
                estancia.setNombre_huesped(resultado.getString(4));
                estancia.setFecha_desde(resultado.getDate(5).toLocalDate());
                estancia.setFecha_hasta(resultado.getDate(6).toLocalDate());
                cliente = new Cliente();
                
                cliente.setNombre(resultado.getString(7));
                cliente.setCiudad(resultado.getString(8));
                cliente.setPais(resultado.getString(9));
                
                casa = new Casa();
                casa.setId_casa(resultado.getInt(10));
                casa.setCalle(resultado.getString(11));
                casa.setNumero(resultado.getInt(12));
                casa.setCodigo_postal(resultado.getString(13));
                casa.setCiudad(resultado.getString(14));
                casa.setPais(resultado.getString(15));
                casa.setFecha_desde(resultado.getDate(16).toLocalDate());
                casa.setFecha_hasta(resultado.getDate(17).toLocalDate());
                casa.setTiempo_minimo(resultado.getInt(18));
                casa.setTiempo_maximo(resultado.getInt(19));
                casa.setPrecio_habitacion(resultado.getFloat(20));
                casa.setTipo_vivienda(resultado.getString(21));
                 Map<Cliente, Casa> mapainterno = new HashMap<>();
                 mapainterno.put(cliente, casa);
                mapa.put(estancia,mapainterno);

            }
            desconectarBase();
            return mapa;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }

}
