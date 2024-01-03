public class Nodo {
    Nodo sig;
    int dato; //Digo que almacena entero como podría decir strings o cualquier tipo de dato


    //Constructor, en este caso no vamos a permitir un constructor sin parametros para simplificar las cosas
    
    public Nodo(int dato){
        this.dato=dato;
        this.sig=null;
    }

    public static void main(String[]args){
        /*EJemplo de como ir insertando elemento a elemento  
        //Creo un objeto de tipo nodo y lo inicializo a nulo por ser buena praxis 
        Nodo lista=null;
        lista=new Nodo(0);//Metemos como dato nuevo un 0
        lista.sig=new Nodo(2);//Indicamos que el siguient dato de la lista va a ser el2 
        lista.sig.sig=new Nodo(4);//El 3º nodo de la lista va a ser el 4
        lista.sig.sig.sig= new Nodo(6);//El 4º nodo de la lista va a ser el 6
        Esto es una gilipollez porque no queremos escribir tanto */
        /*Vamos a insertar 10 elementos a la lista del tiri con un bucle for */
        Nodo lista=null,lista2;
        for(int i=0;i<10;i++){
            lista2=new Nodo(i*10); //El valr que le vamos a meter al nodo 0,10,20...90
            lista2.sig=lista; //El valor de siguiente, es lista es decir un nodo anterior de la lista
            lista=lista2; //El nodo lista ahora almacena el dato de la anteroir iteración
        }
        /*Vamos a imprimir la lista (como estamos insertando al final, imprimiremos el último valor el primero) */
        while(lista!=null){
            System.out.println(lista.dato);
            lista=lista.sig;
        }
        /*DUDA PARA MºLUISA
         *Si ahora queremos insertar al inicio de la lista en vez de al final
         * 
    
        Nodo n2=null;
        for(int i=0;i<10;i++){
            n2= new Nodo(i*100);
            n2.sig=n2;
        }
        while(n2.sig!=null){
            System.out.println(n2.dato);
        }
        */
    }
}
