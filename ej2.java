package hoja3;
import java.lang.Math;
public class ej2 {
    public static void main(String[]args){
        /*
        Para conseguir un número random entre 1-6 lo que debemos hacer es:
        *Invocar a la función random
        *Multiplicar el resultado de la función *6 
        *Sumarle 1 para que nunca salga 0
         */
    System.out.println((int)(Math.random()*6+1));
    }
}
