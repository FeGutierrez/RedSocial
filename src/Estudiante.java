
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
public class Estudiante {
    private String nombre;
    private String apellido;
    private String nick;
    private int edad;
    private String password;
    private String emailDir;
    private ArrayList<Grupo> gruposAdministrados;
    private Fotografia[] todasLasFotografias;
    private Etiqueta[] todasLasEtiquetas;
    private RedSocial redSocial;

    public Estudiante(String nombre, String apellido, String nick, int edad, String password, String emailDir, ArrayList<Grupo> gruposAdministrados, RedSocial redSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.edad = edad;
        this.password = password;
        this.emailDir = emailDir;
        this.gruposAdministrados = gruposAdministrados;
        this.redSocial = redSocial;
    }         

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailDir() {
        return emailDir;
    }

    public void setEmailDir(String emailDir) {
        this.emailDir = emailDir;
    }

    public ArrayList<Grupo> getGruposAdministrados() {
        return gruposAdministrados;
    }

    public void setGruposAdministrados(ArrayList<Grupo> gruposAdministrados) {
        this.gruposAdministrados = gruposAdministrados;
    }
   
    public Fotografia[] getTodasLasFotografias() {
        return todasLasFotografias;
    }

    public void setTodasLasFotografias(Fotografia[] todasLasFotografias) {
        this.todasLasFotografias = todasLasFotografias;
    }

    public Etiqueta[] getTodasLasEtiquetas() {
        return todasLasEtiquetas;
    }

    public void setTodasLasEtiquetas(Etiqueta[] todasLasEtiquetas) {
        this.todasLasEtiquetas = todasLasEtiquetas;
    }

    public RedSocial getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(RedSocial redSocial) {
        this.redSocial = redSocial;
    }
    
    
    
//    public int cantidadGrupos(ArrayList<Grupo> listaGrupos){
//        int j=0;
//        for (int i = 0; i < listaGrupos.size(); i++) {
//                 j=j+1;
//            }
//        return j;
//    }
    
    public boolean crearGrupo(String nombre, String descripcion, String tipoDeGrupo, Estudiante creador, RedSocial redSocial){
        int j=0;
        for (Grupo gruposAdministrado : gruposAdministrados) {
            j=j+1;
        }
        Grupo x = new Grupo(j, nombre, descripcion, tipoDeGrupo, creador, this.redSocial);
        this.gruposAdministrados.add(x);        
        return true;                
    };
    
//    public ArrayList<Grupo> mostrarGruposAdministrados (Estudiante estudiante){
//            return this.gruposAdministrados;
//        }
//    };

    
    
}
