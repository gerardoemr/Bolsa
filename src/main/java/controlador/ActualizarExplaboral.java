package controlador;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.ExplaboralDAO;
import modelo.Profesionista;

@ManagedBean
@ViewScoped
public class ActualizarExplaboral implements Serializable {
     private String id;
     private String empresa;
     private String cargo;
     private Date periodoini;
     private Date periodoter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getPeriodoini() {
        return periodoini;
    }

    public void setPeriodoini(Date periodoini) {
        this.periodoini = periodoini;
    }

    public Date getPeriodoter() {
        return periodoter;
    }

    public void setPeriodoter(Date periodoter) {
        this.periodoter = periodoter;
    }
    
    public void actualizaExplaboral(){
        ExplaboralDAO dao = new ExplaboralDAO();
        dao.actualiza(id, cargo, empresa, periodoini, periodoter);
    }

     
}
