/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Empresa;
import modelo.EmpresaDAO;
import modelo.Explaboral;
import modelo.ExplaboralDAO;

@ManagedBean
@ViewScoped
public class VerExplaboral {
    private List<Explaboral> experiencia;

    public List<Explaboral> getExperiencias() {
        return experiencia;
    }
    
    @PostConstruct
    public void ver() {
        ExplaboralDAO dao = new ExplaboralDAO();
        experiencia = dao.experiencia();
    }
}
