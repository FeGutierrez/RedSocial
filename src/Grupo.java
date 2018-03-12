
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flexxo333
 */
public class Grupo {
    private int id;
    private String nombre;
    private String descripcion;
    private String tipoDeGrupo;
    private String[] noticiasRecientes;
    private Estudiante propietario;
    private ArrayList<Estudiante> miembros;
    private RedSocial redSocial;

    public Grupo(int id, String nombre, String descripcion, String tipoDeGrupo, Estudiante propietario, RedSocial redSocial) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoDeGrupo = tipoDeGrupo;
        this.propietario = propietario;
        this.redSocial = redSocial;
    }        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoDeGrupo() {
        return tipoDeGrupo;
    }

    public void setTipoDeGrupo(String tipoDeGrupo) {
        this.tipoDeGrupo = tipoDeGrupo;
    }

    public String[] getNoticiasRecientes() {
        return noticiasRecientes;
    }

    public void setNoticiasRecientes(String[] noticiasRecientes) {
        this.noticiasRecientes = noticiasRecientes;
    }

    public Estudiante getPropietario() {
        return propietario;
    }

    public void setPropietario(Estudiante propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Estudiante> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Estudiante> miembros) {
        this.miembros = miembros;
    }

    public RedSocial getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(RedSocial redSocial) {
        this.redSocial = redSocial;
    }
    
    public boolean anadirMiembros (Estudiante propietario, Estudiante miembroNuevo){
        if(this.propietario.getNick().equals(propietario.getNick())){
            this.miembros.add(miembroNuevo);
            return true;
        }
        else {
            return false;
        }
    }
    
    
    
    
}
