package Ejercicio_2;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import lecturaArchivosClase.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto1 {
    // Creación de un objeto de tipo scanner
    private Scanner entrada;
    // Creación de arrayList de tipo estadio
    ArrayList<Estadio> lista_estadio = new ArrayList<>();
    // Creación de objeto operación data
    OperacionData ope = new OperacionData();

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("estadios.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // Método para leer registros usando la lista de tipo estadio
    public ArrayList<Estadio> leerRegistros() {
        // Creación de acumulador de suma
        Double suma = 0.0;
        try {// lee registros del archivo, usando el objeto Scanner
            entrada.nextLine();
            while (entrada.hasNext()) {
                // Creación de objeto tipo estadio
                Estadio est = new Estadio();
                // Salto de linea
                String linea = entrada.nextLine();
                // Al arraylist le hacemos un split 
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                // Agregamos el nombre, tipo de deporte y capacidad de tipo estadio
                est.agregar_Nombre(linea_partes.get(0));
                est.agregar_Tipo_deporte(linea_partes.get(1));
                est.agregar_Capacidad(Double.parseDouble(linea_partes.get(2)));
                // Agregamos cada objeto en el arrayList
                lista_estadio.add(est);
            } // fin de while
            // Ciclo for para recorrer la lista
            for (int i = 0; i < lista_estadio.size(); i++) {
                // Acumulamos la suma de capacidades
                suma = suma + lista_estadio.get(i).obtener_Capacidad();
            }
            // Sacamos el promedio con la suma dividiendo para el tamaño del arrayList
            double promedio = suma / lista_estadio.size();
            // Presentación
            System.out.println(promedio);

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista_estadio;
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto


