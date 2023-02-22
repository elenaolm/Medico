/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Herencias.Medico;

/**
 *
 * @author Elena Oliva
 */
public class TrabajadorNoMedico extends Trabajador {

    private String area;

    public TrabajadorNoMedico(String nombre, int id, double sueldo, String area) {
        super(nombre, id, sueldo);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}