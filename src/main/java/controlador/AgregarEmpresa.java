package controlador;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import modelo.Empresa;
import modelo.EmpresaDAO;

@ManagedBean
@ViewScoped
public class AgregarEmpresa {

     private String nombre;
     private String oficinas;
     private Date fundacion;
     private Short numempleados;
     private String contacto;
     private String president;

    public String getNombre() {
        return nombre;
    }

    public String getOficinas() {
        return oficinas;
    }

    public Short getNumempleados() {
        return numempleados;
    }

    public void setNumempleados(Short numempleados) {
        this.numempleados = numempleados;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public String getContacto() {
        return contacto;
    }

    public String getPresident() {
        return president;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setPresident(String president) {
        this.president = president;
    }
   
    public void agregaEmpresa(){
        Empresa e = new Empresa();
        e.setContacto(contacto);
        e.setFundacion(fundacion);
        e.setNombre(nombre);
        e.setNumempleados(numempleados);
        e.setOficinas(oficinas);
        e.setPresident(president);
        EmpresaDAO ed = new EmpresaDAO();
        ed.agrega(e);
    }
}
