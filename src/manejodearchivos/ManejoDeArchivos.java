/*
 * Crear archivo
 *Guardar información en un archivo
 *Eliminar  información de un archivo 
 *eliminar un archivo
 */
package manejodearchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Alumno Mañana
 */
public class ManejoDeArchivos {

    /**
     * 
     *@String nombre nombre del archivo
     */
    
       public static void crearArchivo (String nombre){
             File archivo = new File(nombre);
             try{
             PrintWriter  salida = new PrintWriter(archivo);
             salida.close(); //cierro el puntero "salida"
             }catch(FileNotFoundException ex){
                 ex.printStackTrace(System.out);
             }
         }
 
}
