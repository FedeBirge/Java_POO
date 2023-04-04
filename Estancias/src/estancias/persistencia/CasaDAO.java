package estancias.persistencia;

import estancias.entidades.Casa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
                    + " WHERE id_casa = '" + id + "'";

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

    public Map<Casa, Float> listarCasasAumento() throws Exception {
        try {
            String sql = "SELECT id_casa, ciudad, pais,  precio_habitacion,"
                    + "(precio_habitacion*1.05) as 'Actualizado' FROM casas\n"
                    + "WHERE  pais LIKE 'Reino Unido';";

            consultarBase(sql);

            Map<Casa, Float> mapa = new TreeMap<>();
            Casa casa = null;

            while (resultado.next()) {
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCiudad(resultado.getString(2));
                casa.setPais(resultado.getString(3));
                casa.setPrecio_habitacion(resultado.getFloat(4));
                float precio = resultado.getFloat(5);
                mapa.put(casa, precio);
            }
            desconectarBase();
            return mapa;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Map< String, Integer> listarCasasPais() throws Exception {
        try {
            String sql = "SELECT pais, COUNT(id_casa) FROM casas\n"
                    + "GROUP BY pais;";

            consultarBase(sql);

            Map< String, Integer> mapa = new TreeMap<>();
            String pais = null;
            while (resultado.next()) {

                pais = resultado.getString(1);

                int cant = resultado.getInt(2);
                mapa.put(pais, cant);
            }
            desconectarBase();
            return mapa;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Map< String, Casa> listarCasasLimpias() throws Exception {
        try {
            String sql = "SELECT ca.id_casa, ca.ciudad, ca.pais, ca.tipo_vivienda, c.comentario FROM casas ca\n"
                    + "JOIN comentarios c ON ca.id_casa=c.id_casa\n"
                    + "WHERE  ca.pais LIKE 'Reino Unido'\n"
                    + "AND c.comentario LIKE '%limpia%';";

            consultarBase(sql);

            Map< String, Casa> mapa = new TreeMap<>();
            String coment = null;
            Casa casa = null;
            while (resultado.next()) {
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCiudad(resultado.getString(2));
                casa.setPais(resultado.getString(3));
                casa.setTipo_vivienda(resultado.getString(4));
                coment = resultado.getString(5);
                mapa.put(coment, casa);
            }
            desconectarBase();
            return mapa;
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
                    + "WHERE '" + fecha + "' BETWEEN fecha_desde AND fecha_hasta\n"
                    + "AND " + tiempo + " BETWEEN tiempo_minimo AND tiempo_maximo;";

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
     public Collection<Casa> listarCasas() throws Exception {
        try {
            String sql = "SELECT * FROM casas ";

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
