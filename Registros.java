package ejemplo;
public class Registros{
    /*
     *DISCLAIMER: LO DE HACER DOS CLASES ES UNA COSA MIA PORQUE EN TODA LA PROGRAMACIÓN SE USAN DOS FICHEROS(CLASES) DISTINTAS
     * Esto es algo nuevo, vamos a tener dos clases.
     * Una va a tener el registro y lo que puede hacer el mismo (métodos) y la otra el main y desde la que se le invoque
     * Vamos a utilizar el ejemplo que viene en las diapostivas de la clase fecha
     *_______----____________________------_______________----------__--------__--_--_-_---_--_---_-_--_-____-------_-_--
     *
     *Los objetos no son ni más ni menos que "nuestro propio tipo de dato" al que le tenemos que dar:
     *      -Unas variables con las que trabajar.
     *      -Un valor a esas variables(lo que denominamos constructor)
     *      -Qué puede hacer con esas variables (los métodos del tipo de dato)
     * Importante: Por convenio, los objetos empiezan en mayusculas.
     * Utilizamos this. esta operacion lo que nos permite darle un valor a  las variables
     * que va a utilizar nuestro registro
    */    
    
    //Vamos a declarar con qué tipos de datos va a trabajar nuestro objeto.
    int horas, minutos;
    double segundos;

    /*Vamos a comenzar con el constructor vacio, este es una manera de inicializar los valores para poder construir variables
     * de nuestro nuevo tipo de dato sin tener que incluir unos parámetros que eso ya lo veremos mas adelante.
     * Se inicializa a 0 por convenio y es lo que te recomiendo.
     */
    public Registros(){
        this.horas=0;
        this.minutos=0;
        this.segundos=0.0;
    }
    /*
     * Con el siguiente constructor lo que haremos será permitir actualizar esos valores desde el main empleando el this
     */

    public Registros(int h, int m, double s){
        this.horas=h;
        this.minutos=m;
        this.segundos=s;
    }
    public void hola(){
        System.out.println("Hola, acabo de aprender a invocar funciones dentro de objetos");
    }
    /*Vamos a hacer ahora que nuestro objeto haga cosas, como por ejemplo imprimir los 3 valores que le pasemos desde el main */
    public void imprimirElRegistro(Registros r1){
        System.out.println("La fecha que ha introducido es: " +r1.horas+"horas "+r1.minutos+" minutos y "+ (int)r1.segundos+" segundos");
    }
}