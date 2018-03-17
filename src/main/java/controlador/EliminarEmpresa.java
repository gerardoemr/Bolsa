/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.EmpresaDAO;

@ManagedBean
@ViewScoped
public class EliminarEmpresa implements Serializable {
  
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void eliminaEmpresa(){
        EmpresaDAO em = new EmpresaDAO();
        em.elimina(id);
    }
    
}
