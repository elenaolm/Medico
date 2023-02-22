/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Herencias.Medico;

/**
 *
 * @author Elena Oliva
 */
public class Trabajador {
    private String nombre;
    private int id;
    private double sueldo;
    
    public Trabajador(String nombre, int id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getId() {
        return id;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

