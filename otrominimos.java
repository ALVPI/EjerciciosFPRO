package hoja3;
import java.util.Scanner;
public class otrominimos {
    /**
     * Realice un programa en java 
     * Se le pasará un número comprendido en 1000 y 9999
     * Se devolverá la parte entera del número dada la vuelta
     */
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Introduzca un número entre 1000 y 9999");
        double num = in.nextDouble();
        int um,c,d,u;
        if(num<1000||num>9999){
            System.out.println("El número introducido no pertenece al rango solicitado");
        }else{
            um=(int)(num/1000);
            c=(int)(num%1000)/100;
            d=(int)((num%1000)%100)/10;
            u=(int)((num%1000)%100)%10;
            System.out.print(u*1000+d*100+c*10+um);
        } 
        in.close();
    }
    
}
