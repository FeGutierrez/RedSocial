/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flexxo333
 */
public class Fotografia {
    private String filename;
    private String description;
    private Estudiante propietario;
    private Etiqueta[] etiquetas;

    public Fotografia(String filename, String description, Estudiante propietario) {
        this.filename = filename;
        this.description = description;
        this.propietario = propietario;
    }        

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Estudiante getPropietario() {
        return propietario;
    }

    public void setPropietario(Estudiante propietario) {
        this.propietario = propietario;
    }

    public Etiqueta[] getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(Etiqueta[] etiquetas) {
        this.etiquetas = etiquetas;
    }   
    
    
}
