package hoja3;
import java.util.*;//Importo el Scanner 
public class ej11 {
    public static void main(String[]args){
        int n1,n2,n3;
        Scanner sc = new Scanner (System.in);
        boolean respuesta; //Declaro una variable boolean (Solo puede ser true o false)
        //Imprimo mensajes y pido los números que han de ser entersos
        System.out.println("Le vamos a pedir 3 números y le devolveremos si es posible o no contruir un triángulo con esos valores");
        System.out.print("Introduzca el 1º de los números: ");
        n1= sc.nextInt();
        System.out.print("Introduzca el segundo de los números: ");
        n2=sc.nextInt();
        System.out.print("Introuduzca el tercero de los números: ");
        n3=sc.nextInt();
        System.out.println("Obteniendo respuesta...");
        sc.close();
        respuesta=esPosible(n1,n2,n3);//Invoco a la funciónEsposible
        if(respuesta == true){
            System.out.println("Sí es posible construir un triángulo con esos lados");
        }else{
            System.out.println("No es posible construir un triángulo ");
        }
    }
    public static boolean esPosible(int x,int y,int z){
        /**
         * @param x es un entero
         * @param y es un entero
         * @param z es un entero
         * @return respues, es decir,un boolean que nos indicará si es posible hacer un triángulo o no
         */
        boolean respuesta = false;
        if(x<(y+z)&&y<(x+z)&&z<(x+y)){
            respuesta=true;
        }  
        return respuesta;
    }
}
