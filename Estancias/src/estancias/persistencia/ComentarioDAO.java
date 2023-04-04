package estancias.persistencia;

import estancias.entidades.Comentario;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author feder
 */
public final class ComentarioDAO extends DAO {

    public void guardarComentario(Comentario comentario) throws Exception {
        try {
            if (comentario == null) {
                throw new Exception("Debe indicar el comentario");
            }

            String sql = "INSERT INTO comentarios (id_casa, comentario)"
                    + "VALUES ( '" + comentario.getId_casa() + "' , '" + comentario.getComent() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    public void modificarComentario(Comentario comentario) throws Exception {
        try {
            if (comentario == null) {
                throw new Exception("Debe indicar el comentario que desea modificar");
            }

            String sql = "UPDATE comentarios SET "
                    + "id_casa = '" + comentario.getId_casa()
                    + "', comentario='" + comentario.getComent()
                    + "' WHERE id_comentario = '" + comentario.getId() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    public void eliminarComentario(int id) throws Exception {
        try {

            String sql = "DELETE FROM comentarios WHERE id_comentario = '" + id + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    public Comentario buscarComentarioPorId(int id) throws Exception {
        try {

            String sql = "SELECT * FROM comentarios "
                    + " WHERE id = '" + id + "'";

            consultarBase(sql);

            Comentario comentario = null;
            while (resultado.next()) {
                comentario = new Comentario();
                comentario.setId(resultado.getInt(1));
                comentario.setId_casa(resultado.getInt(2));
                comentario.setComent(resultado.getString(3));
            }
            desconectarBase();
            return comentario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Collection<Comentario> listarComentarios() throws Exception {
        
         try {
            String sql = "SELECT * FROM comentarios ";

            consultarBase(sql);

            Comentario comentario = null;
            Collection<Comentario> comentarios = new ArrayList();
            while (resultado.next()) {
                comentario = new Comentario();
                  comentario.setId(resultado.getInt(1));
                comentario.setId_casa(resultado.getInt(2));
                comentario.setComent(resultado.getString(3));           

            }
            desconectarBase();
            return comentarios;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

}
