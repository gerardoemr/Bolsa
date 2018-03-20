package controlador;
import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Empresa;
import modelo.EmpresaDAO;


@ManagedBean
@ViewScoped
public class ActualizarEmpresa implements Serializable {
     private Empresa empresa;
     private String nombre;
     private String oficinas;
     private Date fundacion;
     private Short numempleados;
     private String contacto;
     private String president;
     private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmpresa(Empresa e){
        this.empresa = e;
    }    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOficinas() {
        return oficinas;
    }

    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

    public Short getNumempleados() {
        return numempleados;
    }

    public void setNumempleados(Short numempleados) {
        this.numempleados = numempleados;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }
    
    public void actualizaEmpresa() {
        EmpresaDAO empresa = new EmpresaDAO();
        empresa.actualiza(id, nombre,oficinas,fundacion,numempleados,contacto,president);
    }
    
}
