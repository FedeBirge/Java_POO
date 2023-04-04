package estancias.persistencia;

import estancias.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author feder
 */
public final class FamiliaDAO extends DAO {

    public void guardarFamilia(Familia familia) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("Debe indicar la familia");
            }

            String sql = "INSERT INTO familias (nombre, edad_minima, edad_maxima, "
                    + "num_hijos, email, id_casa_familia)"
                    + "VALUES ( '" + familia.getNombre() + "' , '" + familia.getEdad_minima() + "' , '"
                    + familia.getEdad_maxima() + "' , '" + familia.getNum_hijos() + "' , '"
                    + familia.getEmail() + "' , '" + familia.getId_casa_familia() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarFamilia(Familia familia) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("Debe indicar la familia que desea modificar");
            }

            String sql = "UPDATE familias SET "
                    + "nombre = '" + familia.getNombre()
                    + "', edad_minima='" + familia.getEdad_minima()
                    + "', edad_maxima='" + familia.getEdad_maxima()
                    + "', num_hijos='" + familia.getNum_hijos()
                    + "', email='" + familia.getEmail()
                    + "', id_casa_familia='" + familia.getId_casa_familia()
                    + "' WHERE id_familia = '" + familia.getId_familia() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarFamilia(int id) throws Exception {
        try {

            String sql = "DELETE FROM familias WHERE id_familia = '" + id + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Familia buscarFamiliaPorId(Integer id) throws Exception {
        try {

            String sql = "SELECT * FROM familias "
                    + " WHERE id = '" + id + "'";

            consultarBase(sql);

            Familia familia = null;
            while (resultado.next()) {
                familia = new Familia();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setId_casa_familia(resultado.getInt(7));
            }
            desconectarBase();
            return familia;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Familia> listarFamilias() throws Exception {
        try {
            String sql = "SELECT * FROM familias ";

            consultarBase(sql);

            Familia familia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setId_casa_familia(resultado.getInt(7));
                familias.add(familia);

            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Familia> listarOp1() throws Exception {
        try {
            String sql = "SELECT * FROM familias\n"
                    + "WHERE num_hijos>=3\n"
                    + "AND edad_maxima<10";

            consultarBase(sql);

            Familia familia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setId_casa_familia(resultado.getInt(7));
                familias.add(familia);

            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }
}
