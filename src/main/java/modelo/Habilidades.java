package modelo;
// Generated 6/03/2018 02:07:24 PM by Hibernate Tools 4.3.1



/**
 * Habilidades generated by hbm2java
 */
public class Habilidades  implements java.io.Serializable {


     private int idH;
     private Profesionista profesionista;
     private String nombre;
     private String grado;

    public Habilidades() {
    }

	
    public Habilidades(int idH, Profesionista profesionista) {
        this.idH = idH;
        this.profesionista = profesionista;
    }
    public Habilidades(int idH, Profesionista profesionista, String nombre, String grado) {
       this.idH = idH;
       this.profesionista = profesionista;
       this.nombre = nombre;
       this.grado = grado;
    }
   
    public int getIdH() {
        return this.idH;
    }
    
    public void setIdH(int idH) {
        this.idH = idH;
    }
    public Profesionista getProfesionista() {
        return this.profesionista;
    }
    
    public void setProfesionista(Profesionista profesionista) {
        this.profesionista = profesionista;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGrado() {
        return this.grado;
    }
    
    public void setGrado(String grado) {
        this.grado = grado;
    }




}


