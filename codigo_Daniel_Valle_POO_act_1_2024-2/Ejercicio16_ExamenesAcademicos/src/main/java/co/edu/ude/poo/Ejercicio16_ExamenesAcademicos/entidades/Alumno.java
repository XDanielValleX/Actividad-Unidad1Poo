/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades;

/**
 *
 * @author daniel
 */
public class Alumno extends Usuario {
    private String numeroMatricula;
    private String semestre;
    private Grupo grupos;
    
    public Alumno(){
        super();
    }
    
    public Alumno(String numeroMatricula, String semestre, Grupo grupos){
        super();
        this.numeroMatricula = numeroMatricula;
        this.semestre = semestre;
        this.grupos = grupos;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de matrícula: " + numeroMatricula);
        System.out.println("Semestre: " + semestre);
    }
}