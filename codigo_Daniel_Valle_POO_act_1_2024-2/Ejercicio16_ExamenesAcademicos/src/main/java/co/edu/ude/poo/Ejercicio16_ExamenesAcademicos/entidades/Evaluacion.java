/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Evaluacion {
    protected String id;
    protected String nombre;
    protected String descripcion;
    protected int numeroPreguntas;
    protected String tipo;
    protected Date fecha;
    protected List<Tema> temas;
    protected List<Asignatura> asignaturas;

    public Evaluacion(){

    }

    public Evaluacion(String id, String nombre, String descripcion, int numerosPreguntas, String tipo, Date fecha, List<Tema> temas, List<Asignatura> asignaturas){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPreguntas = numerosPreguntas;
        this.tipo = tipo;
        this.fecha = fecha;
        this.temas = temas;
        this.asignaturas = asignaturas;
    }
}

