/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Materia;
import java.util.ArrayList;

/**
 *
 * @author Carla
 */
public class ListaMaterias {
    private ArrayList<Materia> ListaM;

    public ListaMaterias() {
        ListaM=new ArrayList();
    }

    /**
     * @return the ListaM
     */
    public ArrayList<Materia> getListaM() {
        return ListaM;
    }

    /**
     * @param ListaM the ListaM to set
     */
    public void setListaM(ArrayList<Materia> ListaM) {
        this.ListaM = ListaM;
    }
    
}
