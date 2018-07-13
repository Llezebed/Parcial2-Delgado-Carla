/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.AlumnoInscr;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Carla
 */
public class ListaAlIns implements Serializable{
  private ArrayList<AlumnoInscr> listaI;

    public ListaAlIns() {
        listaI=new ArrayList();
    }
     public void modificarAlum(AlumnoInscr am){
        for(AlumnoInscr a:listaI){
            if (a.getCod()==(am.getCod())){
                getListaI().set(getListaI().indexOf(a), am);
                FacesMessage message=new FacesMessage("Ha modificado un alumno"+"");
                FacesContext.getCurrentInstance().addMessage(null, message);
                break;
            } else {
            }
        }
    }
     public void eliminarAlum(AlumnoInscr am){
        for(AlumnoInscr a:getListaI()){
   
           if (a.getAlumno().getDNI().equals(am.getAlumno().getDNI())){
                getListaI().remove(getListaI().indexOf(a));
                 FacesMessage message=new FacesMessage("Se ha elim  un nuevo alumno"+"");
    FacesContext.getCurrentInstance().addMessage(null, message);
                break;
               
            }
        }
     }
    

    /**
     * @return the listaI
     */
    public ArrayList<AlumnoInscr> getListaI() {
        return listaI;
    }

    /**
     * @param listaI the listaI to set
     */
    public void setListaI(ArrayList<AlumnoInscr> listaI) {
        this.listaI = listaI;
    }

  
}
