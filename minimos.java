package hoja3;
import java.util.Scanner;
public class minimos {
    public static void main(String[]args){
        //Declaro la variable Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número comprendido entre 1000 y 9999");
        double x = sc.nextDouble();//Declaro la variable x que almacena el numero por teclado
        //Delcaro 4 variables de tipo entero
        /*
         * um son las unidades de millar
         * c son las centenas
         * d son las decenas
         * u son las unidades
         */
        int um,c,d,u;
        if(x<1000 || x>9999){
            System.out.println("No ha introducido un número válido");
        }else{
            //Hago los casteos a enteros para eliminar la parte decimal del double
            um=(int)x/1000;
            c=(int)((x%1000)/100);
            d=(int)(((x%1000)%100)/10);
            u=(int)(((x%1000)%100)%10);
            System.out.println(um*c*d*u);
        }
        sc.close();
    }
}
