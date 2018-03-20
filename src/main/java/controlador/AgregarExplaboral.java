package controlador;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Explaboral;
import modelo.ExplaboralDAO;
import modelo.Profesionista;

@ManagedBean
@ViewScoped
public class AgregarExplaboral {
    
     private int idpro; //id del profesionista relacionado
     private String empresa;
     private String cargo;
     private Date periodoini;
     private Date periodoter;

    public int getIdpro() {
        return idpro;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
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
     
    public void agregaExplaboral(){
        Explaboral e = new Explaboral();
        e.setEmpresa(empresa);
        e.setCargo(cargo);
        e.setPeriodoini(periodoini);
        e.setPeriodoini(periodoini);
        e.setPeriodoter(periodoter);
        ExplaboralDAO dao = new ExplaboralDAO();
        dao.agrega(e, idpro);

    }


}
