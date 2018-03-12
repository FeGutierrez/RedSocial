
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
public class RedSocial {
    private String nombre;
    private String tema;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Grupo> listaGrupos;

    public RedSocial(String nombre, String tema, ArrayList<Estudiante> listaEstudiantes, ArrayList<Grupo> listaGrupos) {
        this.nombre = nombre;
        this.tema = tema;
        this.listaEstudiantes = listaEstudiantes;
        this.listaGrupos = listaGrupos;
    }  
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }   

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    
  
    public ArrayList<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(ArrayList<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }
    
    public Estudiante registrarEstudiante(String nombre, String apellido, String nick, int edad, String password, String email, ArrayList<Grupo> listaGrupos, RedSocial redSocial){
        Estudiante estudiante = new Estudiante(nombre, apellido, nick, edad, password, email, listaGrupos, redSocial);
        return estudiante;
    }
    
    
    
    
    
}
