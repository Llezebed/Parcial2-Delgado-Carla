/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.datos.ListaAlIns;
import aplicacion.modelo.datos.ListaMaterias;
import aplicacion.modelo.dominio.Alumno;
import aplicacion.modelo.dominio.AlumnoInscr;
import aplicacion.modelo.dominio.Materia;
import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Carla
 */
@ManagedBean
@ViewScoped
public class AltaAlumnosFormBean implements Serializable {
 private String DNI;
    private String Nombre;
    private String Apellido;
    private String Domicilio;
    private Date FechaNac;
    private int tel;
     private int cod;
    private String denom;
    private String Carrera;
    private Alumno unAlumno;
    private Materia unaMat;
    private String AñoCur;
    private ListaMaterias ListaMats;
    private AlumnoInscr alIn;
    private ListaAlIns ListaInsc;
    private int codA;
    /**
     * Creates a new instance of AltaAlumnosFormBean
     */
    public AltaAlumnosFormBean () {
        codA=0;
        ListaInsc=new ListaAlIns();
        alIn=new AlumnoInscr();
        unaMat=new Materia();
        unAlumno=new Alumno();
        ListaMats=new ListaMaterias();
        ListaMats.getListaM().add(new Materia(1,"Matematica I (A.E)","Administracion de Empresas","Primero"));
         ListaMats.getListaM().add(new Materia(2,"Informatica II(A.S)","Analista en Sistemas","Segundo"));
          ListaMats.getListaM().add(new Materia(3,"Quimica IV(I.I)","Ingenieria Indutrial","Tercero"));
       
    }
     public void estableceraAl(AlumnoInscr unAl){
       setAlIn(unAl);
   }
     public void cargarDatos(){
      
       cod=cod+1;
       alIn=new AlumnoInscr();
         setUnAlumno(new Alumno(getDNI(), getNombre(), getApellido(), getDomicilio(), getFechaNac(), getTel()));
       getAlIn().setAlumno(getUnAlumno());
       getAlIn().setMateria(getUnaMat());
       getAlIn().setCod(cod);
        ListaInsc.getListaI().add(alIn);
        
         FacesMessage message=new FacesMessage("Se ha Agregado  un nuevo alumno"+"");
    FacesContext.getCurrentInstance().addMessage(null, message);
    
            
         
     }
     public void modicar(){
      ListaInsc.modificarAlum(alIn);
       FacesMessage message=new FacesMessage("modificando"+"");
    FacesContext.getCurrentInstance().addMessage(null, message);
   }
   
   public void eliminar(){
       ListaInsc.eliminarAlum(alIn);
        FacesMessage message=new FacesMessage("eliminando"+"");
    FacesContext.getCurrentInstance().addMessage(null, message);
   }
    

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Domicilio
     */
    public String getDomicilio() {
        return Domicilio;
    }

    /**
     * @param Domicilio the Domicilio to set
     */
    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    /**
     * @return the FechaNac
     */
    public Date getFechaNac() {
        return FechaNac;
    }

    /**
     * @param FechaNac the FechaNac to set
     */
    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    /**
     * @return the tel
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the denom
     */
    public String getDenom() {
        return denom;
    }

    /**
     * @param denom the denom to set
     */
    public void setDenom(String denom) {
        this.denom = denom;
    }

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    /**
     * @return the unAlumno
     */
    public Alumno getUnAlumno() {
        return unAlumno;
    }

    /**
     * @param unAlumno the unAlumno to set
     */
    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }

    /**
     * @return the unaMat
     */
    public Materia getUnaMat() {
        return unaMat;
    }

    /**
     * @param unaMat the unaMat to set
     */
    public void setUnaMat(Materia unaMat) {
        this.unaMat = unaMat;
    }

    /**
     * @return the AñoCur
     */
    public String getAñoCur() {
        return AñoCur;
    }

    /**
     * @param AñoCur the AñoCur to set
     */
    public void setAñoCur(String AñoCur) {
        this.AñoCur = AñoCur;
    }

    /**
     * @return the ListaMats
     */
    public ListaMaterias getListaMats() {
        return ListaMats;
    }

    /**
     * @param ListaMats the ListaMats to set
     */
    public void setListaMats(ListaMaterias ListaMats) {
        this.ListaMats = ListaMats;
    }

    /**
     * @return the alIn
     */
    public AlumnoInscr getAlIn() {
        return alIn;
    }

    /**
     * @param alIn the alIn to set
     */
    public void setAlIn(AlumnoInscr alIn) {
        this.alIn = alIn;
    }

    /**
     * @return the ListaInsc
     */
    public ListaAlIns getListaInsc() {
        return ListaInsc;
    }

    /**
     * @param ListaInsc the ListaInsc to set
     */
    public void setListaInsc(ListaAlIns ListaInsc) {
        this.ListaInsc = ListaInsc;
    }

    /**
     * @return the codA
     */
    public int getCodA() {
        return codA;
    }

    /**
     * @param codA the codA to set
     */
    public void setCodA(int codA) {
        this.codA = codA;
    }
    
}
