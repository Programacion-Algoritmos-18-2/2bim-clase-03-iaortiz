package Ejercicio_1;
// Fig. 14.9: PruebaCrearArchivoTexto.java
// Prueba de la clase CrearArchivoTexto.

import creacionArchivosClases.*;
// Fig. 14.9: PruebaCrearArchivoTexto.java
// Prueba de la clase CrearArchivoTexto.

public class PruebaCrearArchivoTexto
{
   public static void main( String args[] )
   {
      CrearArchivoTexto aplicacion = new CrearArchivoTexto();
      aplicacion.abrirArchivo();
      aplicacion.agregarRegistros();
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaCrearArchivoTexto
