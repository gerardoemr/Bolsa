
package controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.ExplaboralDAO;

@ManagedBean
@ViewScoped
public class EliminarExplaboral implements Serializable {
     private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void eliminaExplaboral(){
        ExplaboralDAO em = new ExplaboralDAO();
        em.elimina(id);
    }
    
}
