import java.util.*;
import java.io.*;

public class LecturaYEscrituraFicheros {
    public static void main(String[] args) {
        /*
         * Vamos a leer los ficheros empleando el Scanner, para ello vamos a modificar
         * la sintaxis habitual
         * Scanner sc = new Scanner(System.in);(sintaxis clasica)
         * Esto significa que el Scanner va a funcionar recogiendo datos de la entrada
         * estandar (System.in)
         * Para cambiar de donde va a leer el scanner modificamos lo de dentro dle new
         * Scanner
         * En el caso de ejemplo, nuestro fichero va a estar en el mismo directorio sino
         * habria que especificar la ruta
         */

        String fichero = "./fichero.txt";
        String ficheroDestino = "./resultado.txt";
        int nrepes = leerDeFichero(fichero);
        String mensaje = "Puta UVa.";
        escribirenFichero(mensaje, nrepes, ficheroDestino);
    }

    /**
     * @param fichero: String que contiene la ruta del fichero
     *                 Esta funcion ira leyendo y mostrando cada linea del fichero y
     *                 nos devolvera un contador con las lineas del mismo
     */
    public static int leerDeFichero(String fichero) {
        /*
         * LA LECTURA DE FICHERO SIEMPRE SIEMPRE SIEMPRE VA DENTRO DE UN TRY CATHC para
         * que en caso de que el fichero
         * no exista el programa no pete de manera horrenda
         * Declaramos nuestro scanner, que es diferente al del main es decir hay que
         * cerrarlo en la funcion sino mal
         * mientras el scanner se encuentre con lineas en el fichero
         * Imprimira el contenido de la linea (el nextLine es un apuntado que se
         * incrementa cada vez que encuentra una linea)
         * en el catch estamos imprimiendo un mensaje de error
         */
        int contador = 0;
        try {
            Scanner leer = new Scanner(new File(fichero));
            while (leer.hasNextLine()) {
                System.out.println(leer.nextLine());
                contador++;

            }
            leer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
           
        }
        return contador;
    }
    /**
     * 
     * @param mensaje: El string que vamos a meter en el fichero
     * @param repes: El nº de veces que vamos a escribir el mensaje
     * @param fichero: La ruta donde queremos crear el fichero y el nombre del mismo 
     * La funcion escribira en el fichero y por pantalla el mensaje 
     */
   public static void escribirenFichero(String mensaje,int repes,String fichero){
        try{
             PrintWriter escribir= new PrintWriter(new FileWriter(fichero));
            while(repes>=0){
                escribir.println(mensaje);
                System.out.println(mensaje);
                repes--;
            }
             escribir.close();
        }catch(IOException e){
            System.out.println("Error: "+e);
           
        }
       

   }
}
