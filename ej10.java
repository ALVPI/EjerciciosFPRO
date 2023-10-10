package hoja3;
import java.util.*;
public class ej10 {
    public static void main(String[]args){
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a pedirle 3 números");
        System.out.println("Introduzca el 1º número: ");
        n1 = sc.nextInt();
        System.out.println("Introduzca el 2º número: ");
        n2= sc.nextInt();
        System.out.println("Introduzca el 3º número: ");
        n3=sc.nextInt();
        sc.close();
        mostrarmenor(n1,n2,n3);
    }
    public static void mostrarmenor(int x, int y, int z){
        //Comprobamos que x sea menor que z e y a la vez 
        //Solo imprimirá el mensaje si las dos condiciones se cumplen
        if(x<y&&x<z){
            System.out.println("El menos de los números es: "+ x);
        //Comprobamos que y sea menor que z y x a la vez 
        }else if(y<x && y<z){
            System.out.println("El menor de los númeroes es: " + y);
        //Comprobamos que z sea menor que x e y  a la vez 
        }else if(z<x && z<y){
            System.out.println("El menor d elos número es:" + z);

        }
    }
}
