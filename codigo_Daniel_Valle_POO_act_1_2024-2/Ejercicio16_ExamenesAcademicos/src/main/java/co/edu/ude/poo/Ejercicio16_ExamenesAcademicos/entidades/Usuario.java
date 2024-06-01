/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades;

public class Usuario {
   protected int dni;
   protected String nombres;
   protected String apellidos;
   protected String genero;
   protected String telefono;
   protected String email;
   protected boolean tipoUsuario;

public Usuario() {
}

   public Usuario(int dni, String nombres, String apellidos, String genero, String telefono, String email, boolean tipoUsuario) {
      this.dni = dni;
      this.nombres = nombres;
      this.apellidos = apellidos;
      this.genero = genero;
      this.telefono = telefono;
      this.email = email;
      this.tipoUsuario = tipoUsuario;
   }


   public int getDni() {
      return dni;
   }

   public void setDni(int dni) {
      this.dni = dni;
   }

   public String getNombres() {
      return nombres;
   }

   public void setNombres(String nombres) {
      this.nombres = nombres;
   }

   public String getApellidos() {
      return apellidos;
   }

   public void setApellidos(String apellidos) {
      this.apellidos = apellidos;
   }

   public String getGenero() {
      return genero;
   }

   public void setGenero(String genero) {
      this.genero = genero;
   }

   public String getTelefono() {
      return telefono;
   }

   public void setTelefono(String telefono) {
      this.telefono = telefono;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public boolean isTipoUsuario() {
      return tipoUsuario;
   }

   public void setTipoUsuario(boolean tipoUsuario) {
      this.tipoUsuario = tipoUsuario;
   }

   public void mostrarInformacion() {
      System.out.println("DNI: " + dni);
      System.out.println("Nombres: " + nombres);
      System.out.println("Apellidos: " + apellidos);
      System.out.println("Género: " + genero);
      System.out.println("Teléfono: " + telefono);
      System.out.println("Email: " + email);
      System.out.println("Tipo de usuario: " + (tipoUsuario ? "Alumno" : "Profesor"));
   }
}
