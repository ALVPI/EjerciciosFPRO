package ejemplo;
public class UsandoObjetos{
    public static void main(String[]args){
        /*
         * Esto es el clasico main, no hace falta que cambiemos nada ni que hagamos nada diferente
         * Lo primero que debemos hacer en declarar una varible del tipo Registros e inicializarla
         * mismo funcionamiento que con el Scanner 
         */
        Registros ejemplo= new Registros();
        ejemplo.horas=2;
        ejemplo.minutos=3;
        ejemplo.segundos=4.0;
        /*Si queremos asignarle los valores directamente loq ue haremos sera:
        Registros ejemplo=new Registros(2,2,4.0);
        */
        Registros ejemplo2= new Registros(13,2,40.0);
        /*Para este punto ya tenemos un registro que almacena 3 números 2,3 y 4.0 
         * Pero nosotros no podemos imprimir nuestro objeto asi a pelo
         * System.out.println(ejemplo);
         * Si queremos invocar y printear la hora tenemos que hacer una funcion en el objeto que nos lo permita hacer
         * Para invocar a las funciones dentro de otra clase,debemos acceder a ella a través del operador . 
         * y empleando el nombre de la variable del tipo que hemos declarado.
        */
        ejemplo.hola();
        ejemplo.imprimirElRegistro(ejemplo);
        ejemplo2.imprimirElRegistro(ejemplo2);
      


    }
}