import java.math.*;
public class TodoEn1 {
    int x, y;
    public TodoEn1(int x0,int y0){
        this.x=x0;
        this.y=y0;
    }
    public static int distancia(TodoEn1 t1, TodoEn1 t2){
        double tmp=(double)((t1.x-t2.x));
        double tmp2= (double)(t1.y-t2.y);
        return (int)Math.sqrt(tmp*tmp2);
    }
    public static void main(String[]args)
    {
        TodoEn1 te1= new TodoEn1(1,9);
        TodoEn1 te2= new TodoEn1(0, 4);
        System.out.println(distancia(te1,te2));
    }
}
