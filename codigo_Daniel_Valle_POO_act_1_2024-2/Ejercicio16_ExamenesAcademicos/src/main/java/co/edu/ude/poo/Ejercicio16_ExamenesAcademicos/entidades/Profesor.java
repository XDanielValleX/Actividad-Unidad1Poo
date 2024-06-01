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
public class Profesor extends Usuario {
   private String departamentoAcademico;
   private String cargo;
   private Date fechaInicioContrato;
   private Date fechaFinContrato;
   private List<Asignatura> AsociadasAsi;
   private List<Practica> AsociadasPr;
   private List<DiseñoColaborativoPractica> AsociadasDi;
   private List<Tema> AsociadosT;
   
   public Profesor(){
      super();
   }

   public Profesor(String departamentoAcademico, String cargo, Date fechaInicioContrato, Date fechaFinContrato){
      super();
      this.departamentoAcademico = departamentoAcademico;
      this.cargo = cargo;
      this.fechaInicioContrato = fechaInicioContrato;
      this.fechaFinContrato = fechaFinContrato;
   }

   public void setDepartamentoAcademico(String departamentoAcademico) {
      this.departamentoAcademico = departamentoAcademico;
   }

   public void setCargo(String cargo) {
      this.cargo = cargo;
   }

   @Override
   public void mostrarInformacion() {
      super.mostrarInformacion();
      System.out.println("Departamento académico: " + departamentoAcademico);
      System.out.println("Cargo: " + cargo);
   }
}