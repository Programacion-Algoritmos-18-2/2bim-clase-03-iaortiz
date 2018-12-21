/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivosClase;

/**
 *
 * @author isral
 */
public class Main {
    public static void main(String[] args) {
        lecturaArchivosClase.LeerArchivoTexto1 aplicacion = new LeerArchivoTexto1();
        aplicacion.abrirArchivo();
        aplicacion.leerRegistros();
        aplicacion.cerrarArchivo();
    }
}
