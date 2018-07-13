/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Carla
 */
public class Materia {
    private int cod;
    private String denom;
    private String Carrera;
    private String AñoCur;

    public Materia(int cod, String denom, String Carrera, String AñoCur) {
        this.cod = cod;
        this.denom = denom;
        this.Carrera = Carrera;
        this.AñoCur = AñoCur;
    }

    public Materia() {
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
    
}
