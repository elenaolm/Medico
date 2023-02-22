/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Herencias.Medico;

/**
 *
 * @author Elena Oliva
 */
public class TestMedico {
        public static void main(String[] args) {
            // Crear un objeto Trabajador
            Trabajador trabajador1 = new Trabajador("Juan Pérez", 12345, 2500.0);
            System.out.println("Nombre: " + trabajador1.getNombre());
            System.out.println("ID: " + trabajador1.getId());
            System.out.println("Sueldo: " + trabajador1.getSueldo());

            // Crear un objeto Médico
            Medico medico1 = new Medico("María López", 54321, 3500.0, 1234, 50);
            System.out.println("Nombre: " + medico1.getNombre());
            System.out.println("ID: " + medico1.getId());
            System.out.println("Sueldo: " + medico1.getSueldo());
            System.out.println("Número de colegiado: " + medico1.getNumColegiado());
            System.out.println("Número de pacientes atendidos: " + medico1.getNumPacientes());

            // Crear un objeto TrabajadorNoMedico
            TrabajadorNoMedico noMedico1 = new TrabajadorNoMedico("Ana Gómez", 67890, 2000.0, "Enfermería");
            System.out.println("Nombre: " + noMedico1.getNombre());
            System.out.println("ID: " + noMedico1.getId());
            System.out.println("Sueldo: " + noMedico1.getSueldo());
            System.out.println("Área de trabajo: " + noMedico1.getArea());
        }
    }


