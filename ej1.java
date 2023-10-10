package hoja3;
import java.util.*;
import java.lang.Math;
public class ej1 {
    public static void main(String[]args){
        double num;
        Scanner in = new Scanner(System.in);
        System.out.print("Escriba un número y le devolveremos sus diferentes raices:");
        num=in.nextDouble();
        in.close();
        System.out.println("La raíz cuadrada del número es:" + raizCuadrada(num));
        System.out.println("La raíz cubica del número es:"+ raizTercera(num));
        System.out.println("La raíz cuarta del número es:"+ raizCuarta(num));
        System.out.println("La raíz quinta del número es:"+ raizQuinta(num));
    }
    public static double raizCuadrada(double a){
        /**
         * Función que me va a calcular la raíz cuadrada de un número
         * @param un double 
         * @return la raíz cuadrada del número
         */
        return Math.sqrt(a);
    }
    public static double raizTercera(double a){  
        /**
         * Función que me va a calcular la raíz cúbica de un número
         * Hacer una raíz de orden n es lo miso que hacer num^(1/n)
         * @param un double 
         * @return la raíz cúbica del número
         */
    
        return Math.pow(a,1.0/3);
    }
    public static double raizCuarta(double a){
        /**
         * Función que me va a calcular la raíz cuarta de un número
         * Hacer una raíz de orden n es lo miso que hacer num^(1/n)
         * @param un double 
         * @return la raíz cuarta del número
         */
        return Math.pow(a,1.0/4);
    }
    public static double raizQuinta(double a){
        /**
         * Función que me va a calcular la raíz quinta de un número
         * Hacer una raíz de orden n es lo miso que hacer num^(1/n)
         * @param un double 
         * @return la raíz quinta del número
         */
        return Math.pow(a,(1.0/5));
    }
}
