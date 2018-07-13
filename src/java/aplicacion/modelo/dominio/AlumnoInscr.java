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
public class AlumnoInscr {
    private int cod;
    private Alumno alumno;
    private Materia Materia;

    public AlumnoInscr(Alumno alumno, Materia Materia) {
        this.alumno = alumno;
        this.Materia = Materia;
    }

    public AlumnoInscr() {
    }

    /**
     * @return the alumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the Materia
     */
    public Materia getMateria() {
        return Materia;
    }

    /**
     * @param Materia the Materia to set
     */
    public void setMateria(Materia Materia) {
        this.Materia = Materia;
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
    
}
