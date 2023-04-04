package estancias.entidades;

/**
 *
 * @author feder
 */
public class Comentario {
    private int id; 
    private int id_casa; 
    private String coment;

    public Comentario() {
    }

    public Comentario(int id, int id_casa, String coment) {
        this.id = id;
        this.id_casa = id_casa;
        this.coment = coment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    @Override
    public String toString() {
        return "Comentario ID: " + id + ", Casa ID: " + id_casa 
                + "\n'" + coment+ "'";
    }
    
    
    
}
