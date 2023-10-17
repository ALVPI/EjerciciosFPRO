package hoja3;
import java.util.*;
public class ej3 {
    public static void main(String[]args){
        int d,m,y;
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca el día:");
        d = sc.nextInt();
        System.out.print("Introduzca el mes:");
        m =sc.nextInt();
        System.out.print("Introduzca el año:");
        y = sc.nextInt();
        sc.close();
        fecha(d,m,y);
        date(m,d,y);
    }
    public static void fecha(int d, int m, int y){
        /**
         * Procedimiento que impirmirá por pantalla(por eso es void porque
         * no retorna nada al main)
         * @param tres enteros , día mes y año
         */
        System.out.println("La fecha en formato España sería "+ d+":"+m+":"+y);
    }
    public static void date(int m, int d, int y){
         /**
         * Procedimiento que impirmirá por pantalla(por eso es void porque
         * no retorna nada al main)
         * @param tres enteros , día mes y año
         */
        System.out.println("La fecha en formato EEUU sería "+m +":"+y+":"+d);
    }
}
