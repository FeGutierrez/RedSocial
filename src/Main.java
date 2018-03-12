
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
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Grupo> listaGrupos = new ArrayList<>();
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        RedSocial redSocial= new RedSocial("RedSocial 1", "temaRed", listaEstudiantes, listaGrupos );
        Estudiante p = redSocial.registrarEstudiante("Fell","Gut","Fryl",20,"qsc", "flatlinerz", listaGrupos, redSocial);
        Estudiante q = redSocial.registrarEstudiante("Neeee", "Qaaaaa", "Lezzzz", 26, "String", "Correo", listaGrupos, redSocial);
        
        
        //Estudiante p = new Estudiante("Fell","Gut","Fryl",20,"qsc", "flatlinerz", listaGrupos);
        //Estudiante q = new Estudiante("Cam","Stak","JKL",20,"SSSSS", "gudddd", listaGrupos);
        p.crearGrupo("Pesm", "Grupo aleatorio", "Ocio", p, redSocial);
        p.crearGrupo("Mtrx", "Simulacra", "Simulation", p, redSocial);
        
        
        
        
        q.crearGrupo("Name", "Desc", "Type", q, redSocial);
        
        //Inicio Listado
        System.out.println("LISTADO GRUPOS ADMINISTRADOS POR P");
        for (int i = 0; i < listaGrupos.size(); i++) {
            if(p.getGruposAdministrados().get(i).getPropietario() == p){
                 System.out.println(p.getGruposAdministrados().get(i).getNombre());
                System.out.println("ID " + p.getGruposAdministrados().get(i).getId());
                System.out.println("\n");               
            }
           
        }
        
        System.out.println("LISTADO GRUPOS ADMINISTRADOS POR Q");
        for (int i = 0; i < listaGrupos.size(); i++) {
            if(q.getGruposAdministrados().get(i).getPropietario() == q){
            System.out.println(q.getGruposAdministrados().get(i).getNombre());
            System.out.println("ID " + q.getGruposAdministrados().get(i).getId());
            System.out.println("\n");
            }
        }
        //Fin Listado
        
    }
    
}
