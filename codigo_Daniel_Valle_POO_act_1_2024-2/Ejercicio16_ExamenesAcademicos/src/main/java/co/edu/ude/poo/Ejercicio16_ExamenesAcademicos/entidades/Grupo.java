/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades;

import java.util.List;

/**
 *
 * @author daniel
 */
public class Grupo {
    private String nombre;
    private List<Alumno> alumnos;
    private List<Asignatura> asignaturas;

    public Grupo(){

    }

    public Grupo(String nombre, List<Alumno> alumnos, List<Asignatura> asignaturas){
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.asignaturas = asignaturas;
    }
}
