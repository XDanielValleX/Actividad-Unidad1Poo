/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades;

import java.util.List;

/**
 *
 * @author daniel
 */
public class Practica {
    protected String codigoPractica;
    protected String titulo;
    protected String dificultad;
    protected int nota;
    protected Profesor profesores;
    protected List<Alumno> alumnos;
    protected List<ActividadPracticaGrupal> actividadesGrupales;

    public Practica(){

    }

    public Practica(String codigoPractica, String titulo, String dificultad, List<Alumno> alumnos, Profesor profesores, List<ActividadPracticaGrupal> actividadesGrupales){
    this.codigoPractica = codigoPractica;
    this.titulo = titulo;
    this.dificultad = dificultad;
    this.alumnos = alumnos;
    this.profesores = profesores;
    this.actividadesGrupales = actividadesGrupales;
    }
}
