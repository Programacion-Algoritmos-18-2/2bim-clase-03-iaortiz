/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import java.util.ArrayList;

/**
 *
 * @author isral
 */
public class OperacionData {
    // Creación de arrayList tipo estadio
    ArrayList<Estadio> informacion;
    
    // Métodos get y set para el arrayList
    public void agregarInformacion(ArrayList<Estadio> info) {
        informacion = info;
    }

    public ArrayList obtenerInformacion() {
        return informacion;
    }
    // Método para sacar el promedio
    public double promedio() {
        // Creación de varaibles
        double suma = 0.0;
        double promedio;
        // Ciclo for para recorrer el arrayList
        for (int i = 0; i < informacion.size(); i++) {
            // Acumulamos la suma de capacidades
            suma = suma + informacion.get(i).obtener_Capacidad();
        }
        // SAcamos el promedio de la suma total para el tamaño del arrayList
        promedio = suma / informacion.size();
        // Retornamos el promedio
        return promedio;
    }
}
