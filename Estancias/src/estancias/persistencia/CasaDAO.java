package estancias.persistencia;

import estancias.entidades.Casa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author feder
 */
public final class CasaDAO extends DAO {

    public void guardarCasa(Casa casa) throws Exception {
        try {
            if (casa == null) {
                throw new Exception("Debe indicar la casa");
            }

            String sql = "INSERT INTO casas (calle, numero, codigo_postal, ciudad, pais,"
                    + "fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo,precio_habitacion, tipo_vivienda)"
                    + "VALUES ( '" + casa.getCalle() + "' , '" + casa.getNumero() + "' , '"
                    + casa.getCodigo_postal() + "' , '" + casa.getCiudad() + "' , '"
                    + casa.getPais() + "' , '" + casa.getFecha_desde() + "' , '" + casa.getFecha_hasta() + "' , '"
                    + casa.getTiempo_minimo() + "' , '" + casa.getTiempo_maximo() + "' , '"
                    + casa.getPrecio_habitacion() + "' , '" + casa.getTipo_vivienda() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarCasa(Casa casa) throws Exception {
        try {
            if (casa == null) {
                throw new Exception("Debe indicar lal casa que desea modificar");
            }

            String sql = "UPDATE casas SET " // COMPLETAR SENTENCIA
                    + "clave = '" + casa.getCiudad() + "' WHERE id_casa = '" + casa.getId_casa() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarCasa(int id) throws Exception {
        try {

            String sql = "DELETE FROM casas WHERE id_casa = '" + id + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    public Casa buscarCasaPorId(int id) throws Exception {
        try {

            String sql = "SELECT * FROM casas "
                    + " WHERE id = '" + id + "'";

            consultarBase(sql);

            Casa casa = null;
            while (resultado.next()) {
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7).toLocalDate());
                casa.setFecha_hasta(resultado.getDate(8).toLocalDate());
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getFloat(11));
                casa.setTipo_vivienda(resultado.getString(12));

            }
            desconectarBase();
            return casa;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Casa> listarCasas() throws Exception {
        try {
            String sql = "SELECT * FROM casas ";

            consultarBase(sql);
            Collection<Casa> casas = new ArrayList();
            Casa casa = null;
            while (resultado.next()) {
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7).toLocalDate());
                casa.setFecha_hasta(resultado.getDate(8).toLocalDate());
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getFloat(11));
                casa.setTipo_vivienda(resultado.getString(12));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Casa> listarCasasDisponibleAgosto() throws Exception {
        try {
            String sql = "SELECT * FROM casas\n"
                    + "WHERE fecha_desde >= '2020-08-01' AND fecha_hasta <='2020-08-31'\n"
                    + "AND pais LIKE 'Reino Unido'; ";

            consultarBase(sql);

            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7).toLocalDate());
                casa.setFecha_hasta(resultado.getDate(8).toLocalDate());
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getFloat(11));
                casa.setTipo_vivienda(resultado.getString(12));
                casas.add(casa);

            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }

    public Collection<Casa> listarCasasDisponibleFechasOp4(LocalDate fecha, int tiempo) throws Exception {
        try {
            String sql = "SELECT * FROM casas\n"
                    + "WHERE '"+fecha+"' BETWEEN fecha_desde AND fecha_hasta\n"
                    + "AND "+tiempo+" BETWEEN tiempo_minimo AND tiempo_maximo;";

            consultarBase(sql);

            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7).toLocalDate());
                casa.setFecha_hasta(resultado.getDate(8).toLocalDate());
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getFloat(11));
                casa.setTipo_vivienda(resultado.getString(12));
                casas.add(casa);

            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }
}
