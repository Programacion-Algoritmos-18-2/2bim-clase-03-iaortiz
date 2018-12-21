/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author isral
 */
public class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }
    
    public String obtener_Nombre() {
        return nombre;
    }

    public void agregar_Nombre(String nom) {
        nombre = nom;
    }

    public int obtener_Edad() {
        return edad;
    }

    public void agregar_Edad(int e) {
        edad = e;
    }
    
}
