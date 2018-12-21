/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author isral
 */
public class Estadio {

    String nombre;
    String tipo_deporte;
    double capacidad;

    public Estadio(String nombre, String tipo_deporte, double capacidad) {
        agregar_Nombre(nombre);
        agregar_Tipo_deporte(nombre);
        agregar_Capacidad(capacidad);

    }

    public Estadio() {
    }

    public String obtener_Nombre() {
        return nombre;
    }

    public void agregar_Nombre(String nomb) {
        nombre = nomb;
    }

    public String obtener_Tipo_deporte() {
        return tipo_deporte;
    }

    public void agregar_Tipo_deporte(String t_d) {
        tipo_deporte = t_d;
    }

    public double obtener_Capacidad() {
        return capacidad;
    }

    public void agregar_Capacidad(double cap) {
        capacidad = cap;
    }

    @Override
    public String toString() {
        String str = String.format("Nombre del estadio: %s\nTipo de deporte: %s\nCapacidad: %.2f\n",
                this.nombre, this.tipo_deporte, this.capacidad);
        return str;
    }

}
