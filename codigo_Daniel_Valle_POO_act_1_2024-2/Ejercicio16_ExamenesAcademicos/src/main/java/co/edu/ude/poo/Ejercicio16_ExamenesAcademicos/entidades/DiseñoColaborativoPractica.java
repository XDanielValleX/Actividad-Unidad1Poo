/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author daniel
 */
public class DiseñoColaborativoPractica {
    private int numeroProfesores;
    private Date fechaDiseño;
    private List<Profesor> profesores;

    public DiseñoColaborativoPractica(){

    }

    public DiseñoColaborativoPractica(int numeroProfesores, Date fechaDiseño, List<Profesor> profesores){
        this.numeroProfesores = numeroProfesores;
        this.fechaDiseño = fechaDiseño;
        this.profesores = profesores;
    }
}
