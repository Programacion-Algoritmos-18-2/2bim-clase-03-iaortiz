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
public class Main {

    public static void main(String[] args) {
        // Creación de un objeto tpo leer archivo
        LeerArchivoTexto1 apl = new LeerArchivoTexto1();
        // Creación de un objeto tipo operacion data
        OperacionData op = new OperacionData();
        // Abre el archivo
        apl.abrirArchivo();
        // Usamos operación data para manejar la lista, de nuestro registro
        op.agregarInformacion(apl.leerRegistros());
        // Obtenemos la información
        op.obtenerInformacion();
        // Presentación del promedio
        System.out.printf("El promedio es: %.2f\n", op.promedio());
    }
}
