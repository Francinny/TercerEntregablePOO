package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Controlador {
    private LinkedList<Usuario> listaUsuarios = new LinkedList();
    private LinkedList<Semestre> listaSemestres = new LinkedList();
    private LinkedList<Profesor> listaProfesores = new LinkedList();
    private LinkedList<AulaTeorica> listaAulasTeoricas = new LinkedList();
    private LinkedList<Laboratorio> listalaboratorio = new LinkedList();
    private LinkedList<Departamento> listaDepartamento = new LinkedList();
    private LinkedList<AsignaturaPractica> listaAsignaturaPractica = new LinkedList();
    private LinkedList<AsignaturaTeorica> listaAsignaturaTeoricas = new LinkedList<>();
    private LinkedList<Grupo> listagrupo = new LinkedList<>();
    /**
     * inserta usuarios en la lista de usuarios
     * @param u usuario a insertar
     */
    public void insertarUsuario(Usuario u){
        listaUsuarios.add(u);
    }
    
    /**
     * inserta semestres en la lista de semestres
     * @param s semestre a insertar
     */
    public void insertarSemestre(Semestre s){
        listaSemestres.add(s);
    }
    
    /**
     * valida que el usuario a ingresar al sistema exista y que todos los datos 
     * ingresados sean correctos
     * @param nU nombre de usuario
     * @param cU clave de usuario
     * @param tU tipo de usuario
     * @return mensaje relacionado con la busqueda del usuario
     */
    public String validarUsuario(String nU, String cU, String tU){
        
        for (int l = listaUsuarios.size(), i = 0; l > i; i++){
            if (listaUsuarios.get(i).getUsuario().equals(nU) &&
                    listaUsuarios.get(i).getClave().equals(cU)){
                if (listaUsuarios.get(i).getTipo().equals(tU)){
                    return "correcto";
                }else{
                    return "Tipo de Usuario Incorrecto";
                }
            }
        }return "no se encuentra el usuario";
    }
    
    /**
     * inserta profesores en la lista de profesores
     * @param p profesor a insertar
     */
    public void insertarProfesor(Profesor p){
        listaProfesores.add(p);
    }
    /**
     * Inserta aula teoricas en la lista de aulas teoricas
     * @param a aula a insertar
     */
    public void insertarAulaTeorica(AulaTeorica a){
        listaAulasTeoricas.add(a);
    }
    
    /**
     * Inserta laboratorios en la lista de laboratorios
     * @param l laboratorio a insertar
     */
    public void insertarLaboratorio(Laboratorio l){
        listalaboratorio.add(l);
    }
    
    /**
     * Inserta departamento en la lista de departamentos
     * @param D departamento a insertar
     */
    public void insertarDepartamento(Departamento d){
        listaDepartamento.add(d);
    }
    /**
     * Inserta Asignaturas Practicas en la lista de Asignaturas
     * @param AP asignatura práctica a insertar
     */
    public void insertarAsignaturaPractica(AsignaturaPractica ap){
      listaAsignaturaPractica.add(ap);
    }
    /**
     * Inserta Asignatura Teórica en la lista de Asignaturas
     * @param AT  asignatura teórica a insertar
     */
    public void insertarAsignaturaTeorica(AsignaturaTeorica at){
    listaAsignaturaTeoricas.add(at);
    }
    
    public void insertargrupo(Grupo g){
    listagrupo.add(g);
    }
   
    
}
