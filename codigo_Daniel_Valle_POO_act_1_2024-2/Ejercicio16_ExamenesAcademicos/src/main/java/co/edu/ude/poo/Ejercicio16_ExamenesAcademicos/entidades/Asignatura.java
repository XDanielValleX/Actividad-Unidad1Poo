/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades;

/**
 *
 * @author daniel
 */
public class Asignatura {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private int creditosAcademicos;
    private int añoAcademico;
    private String semestre;
    private String horarioClases;
    private Evaluacion evaluaciones;
    private Grupo grupos;
    private Alumno alumnos;
    
    public Asignatura(){
        
        
    }
    
    public Asignatura(String codigo, String nombre, String descripcion, int creditosAcademicos, int añoAcademico, String semestre, String horarioClases, Evaluacion evaluaciones, Grupo grupos, Alumno aloumnos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditosAcademicos = creditosAcademicos;
        this.semestre = semestre;
        this.horarioClases = horarioClases;
        this.evaluaciones = evaluaciones;
        this.grupos = grupos;
        this.alumnos = aloumnos;
    }
}
