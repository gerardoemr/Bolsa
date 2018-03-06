package modelo;
// Generated 6/03/2018 02:07:24 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Explaboral generated by hbm2java
 */
public class Explaboral  implements java.io.Serializable {


     private int idexplaboral;
     private Profesionista profesionista;
     private String empresa;
     private String cargo;
     private Date periodoini;
     private Date periodoter;

    public Explaboral() {
    }

	
    public Explaboral(int idexplaboral, Profesionista profesionista) {
        this.idexplaboral = idexplaboral;
        this.profesionista = profesionista;
    }
    public Explaboral(int idexplaboral, Profesionista profesionista, String empresa, String cargo, Date periodoini, Date periodoter) {
       this.idexplaboral = idexplaboral;
       this.profesionista = profesionista;
       this.empresa = empresa;
       this.cargo = cargo;
       this.periodoini = periodoini;
       this.periodoter = periodoter;
    }
   
    public int getIdexplaboral() {
        return this.idexplaboral;
    }
    
    public void setIdexplaboral(int idexplaboral) {
        this.idexplaboral = idexplaboral;
    }
    public Profesionista getProfesionista() {
        return this.profesionista;
    }
    
    public void setProfesionista(Profesionista profesionista) {
        this.profesionista = profesionista;
    }
    public String getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Date getPeriodoini() {
        return this.periodoini;
    }
    
    public void setPeriodoini(Date periodoini) {
        this.periodoini = periodoini;
    }
    public Date getPeriodoter() {
        return this.periodoter;
    }
    
    public void setPeriodoter(Date periodoter) {
        this.periodoter = periodoter;
    }




}

