package Ejercicio_1;

// Fig. 14.7: CrearArchivoTexto.java
// Uso de la clase Formatter para escribir datos en un archivo de texto.
import creacionArchivosClases.*;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// import com.deitel.jhtp7.cap14.RegistroCuenta;
public class CrearArchivoTexto {

    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            salida = new Formatter("personas.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // agrega registros al archivo
    public void agregarRegistros() {
        // objeto que se va a escribir en el archivo

        Persona perso = new Persona();
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;

        // while ( entrada.hasNext() ) // itera hasta encontrar el indicador de fin de archivo
        while (bandera == true) // itera hasta encontrar el indicador de fin de archivo
        {
            try // env�a valores al archivo
            {
                // obtiene los datos que se van a enviar
                System.out.println("Ingrese el nombre");
                perso.agregar_Nombre(entrada.next());
                System.out.println("Ingrese la edad");
                perso.agregar_Edad(entrada.nextInt());
                salida.format("%s %d\n", perso.obtener_Nombre(), perso.obtener_Edad());
                
                System.out.println("Desea ingresar más cuentas si (1), no(2)");
                int valor = entrada.nextInt();
                if (valor == 2) {
                    bandera = false;
                }
            } // fin de try
            catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } // fin de catch
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
            } // fin de catch
        } // fin de while
    } // fin del m�todo agregarRegistros
    // cierra el file

    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase CrearArchivoTexto
