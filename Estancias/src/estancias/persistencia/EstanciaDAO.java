package estancias.persistencia;

import estancias.entidades.Estancia;
import java.util.ArrayList;
import java.util.Collection;

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
                estancia.setId_estancia(resultado.getInt(2));
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

}
