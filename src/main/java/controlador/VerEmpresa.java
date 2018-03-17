package controlador;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import modelo.Empresa;
import modelo.EmpresaDAO;


@ManagedBean
@ViewScoped
public class VerEmpresa implements Serializable {
    private List<Empresa> empresas;

    public List<Empresa> getEmpresas() {
        return empresas;
    }
    
    @PostConstruct
    public void ver() {
        EmpresaDAO lib = new EmpresaDAO();
        empresas= lib.empresas();
    }
}