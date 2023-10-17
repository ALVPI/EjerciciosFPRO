package hoja3;
import java.util.*;
public class sumaAngulos{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int g,m,s,tmp,gs,ms,ss;
        System.out.println("Introduzca los grados");
        g=sc.nextInt();
        System.out.println("Introduzca los minutos");
        m=sc.nextInt();
        System.out.println("Introduzca los segundos");
        s=sc.nextInt();
        //paso todo a segundos
        tmp=g*3600+m*60+s;
        System.out.println("Introduzca los grados del segundo ángulo");
        g=sc.nextInt();
        System.out.println("Introduzca los minutos del segundo ángulo");
        m=sc.nextInt();
        System.out.println("Introduzca los segundos del segundo ángulo");
        s=sc.nextInt();
        //Paso todo a segundos y sumo con los segundos del 1º angulo
        tmp=tmp+g*3600+m*60+s;
        gs=tmp/3600;
        if(gs>360){
            System.out.println("La suma de los grados es superior a 360, por lo que no cumple con las especificaciones del enunciado");
        }
        ms=tmp%3600/60;
        ss=tmp%3600%60;
        System.out.println("La suma de sus dos ángulos sumados en grados minutos y segundos es");
        System.out.print(gs+"º"+ms+"'"+ss+"''s");
        sc.close();
    }
}