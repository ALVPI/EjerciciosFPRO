package hoja3;
import java.util.*;
public class ej4 {
    public static void main(String[]args){
        //Declaramos variables
        String day;
        int d,m,y;
        Scanner sc = new Scanner(System.in);
        //Vamos pidiendo cada una de las variables por teclado
        System.out.print("Introduzca el día de la semana: ");
        day = sc.next();
        System.out.print("Introduzca el número del día: ");
        d =sc.nextInt();
        System.out.print("Introduzca el número del mes: ");
        m = sc.nextInt();
        System.out.print("Introduzca el número del año: ");
        y= sc.nextInt();
        //Cerramos el escaner
        sc.close();
        //Llamamos al procedimiento
        construye(day,d,m,y);
    }
    public static void construye(String day, int d, int m, int y){
        /**
         *@param String day, que corresponde al día de la semana
         *@param int d es el día del mes
         *@param int m es el número del mes
         *@param int y es el anno 
         */
        System.out.println(day+" "+d+" del "+m+" de "+y);
    }
}
