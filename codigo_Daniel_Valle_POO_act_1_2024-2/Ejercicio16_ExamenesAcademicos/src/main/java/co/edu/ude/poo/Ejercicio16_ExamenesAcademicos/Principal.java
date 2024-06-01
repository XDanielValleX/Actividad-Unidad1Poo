/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Ejercicio16_ExamenesAcademicos;
import java.util.Scanner;

import co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades.Alumno;
import co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades.Profesor;
import co.edu.ude.poo.Ejercicio16_ExamenesAcademicos.entidades.Usuario;

/**
 *
 * @author daniel
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Inicio del Programa");
        System.out.println("---------------------------------");
        System.out.println("Por favor Identifiquese: ");
        System.out.println("1. Alumno");
        System.out.println("2. Profesor");
        int opcion = scanner.nextInt();

        Usuario usuario = null;

        switch (opcion) {
            case 1:
                usuario = crearAlumno(scanner);
                break;
            case 2:
                usuario = crearProfesor(scanner);
                break;
            default:
                System.out.println("");
                System.out.println("Opción no válida.");
        }

        if (usuario != null) {
            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("Biemvenido! aqui esta su informacion Inicial: ");
            System.out.println("- Información del usuario:");
            usuario.mostrarInformacion();
        }

        scanner.close();
    }

    public static Alumno crearAlumno(Scanner scanner) {
        System.out.println("Ingrese el DNI:");
        int dni = scanner.nextInt();
        scanner.nextLine();
    
        System.out.println("Ingrese los nombres:");
        String nombres = scanner.nextLine();
    
        System.out.println("Ingrese los apellidos:");
        String apellidos = scanner.nextLine();
    
        System.out.println("Ingrese el género:");
        String genero = scanner.nextLine();
    
        System.out.println("Ingrese el número de teléfono:");
        String telefono = scanner.nextLine();
    
        System.out.println("Ingrese el correo electrónico:");
        String email = scanner.nextLine();
    
        System.out.println("Ingrese el número de matrícula:");
        String numeroMatricula = scanner.nextLine();
    
        System.out.println("Ingrese el semestre:");
        String semestre = scanner.nextLine();
    
        Alumno alumno = new Alumno();
        alumno.setDni(dni);
        alumno.setNombres(nombres);
        alumno.setApellidos(apellidos);
        alumno.setGenero(genero);
        alumno.setTelefono(telefono);
        alumno.setEmail(email);
        alumno.setNumeroMatricula(numeroMatricula);
        alumno.setSemestre(semestre);
        alumno.setTipoUsuario(true);
    
        return alumno;
    }

    public static Profesor crearProfesor(Scanner scanner) {
        System.out.println("Ingrese el DNI:");
        int dni = scanner.nextInt();
        scanner.nextLine();
    
        System.out.println("Ingrese los nombres:");
        String nombres = scanner.nextLine();
    
        System.out.println("Ingrese los apellidos:");
        String apellidos = scanner.nextLine();
    
        System.out.println("Ingrese el género:");
        String genero = scanner.nextLine();
    
        System.out.println("Ingrese el número de teléfono:");
        String telefono = scanner.nextLine();
    
        System.out.println("Ingrese el correo electrónico:");
        String email = scanner.nextLine();
    
        System.out.println("Ingrese el departamento académico:");
        String departamentoAcademico = scanner.nextLine();
    
        System.out.println("Ingrese el cargo:");
        String cargo = scanner.nextLine();
    
        Profesor profesor = new Profesor();
        profesor.setDni(dni);
        profesor.setNombres(nombres);
        profesor.setApellidos(apellidos);
        profesor.setGenero(genero);
        profesor.setTelefono(telefono);
        profesor.setEmail(email);
        profesor.setDepartamentoAcademico(departamentoAcademico);
        profesor.setCargo(cargo);
        profesor.setTipoUsuario(false); // Establecer el tipo de usuario como Profesor
    
        return profesor;
    }
}
