package sample;

import java.util.Scanner;

/**
 * Created by lenovo on 08/11/2017.
 */
public class Pilas {
    private Nodo top; // inicio de la pila
    private int tamaño; // registra el tamaño de la pila

    public Pilas(){
        top = null;
    }

    public boolean vacia(){
        return (top == null);
    }


    public void Push(int valor){
        Nodo nuevoNodo;
        if(vacia())
            top = new Nodo(valor);
        else {
            nuevoNodo = new Nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }

    //Tamaño
    public int getTamaño() { //Consulta los elemntos (nodos que tiene la pla)
        //return numero entero entre 0 y n numros
        return tamaño;
    }


    public void peek(){//Mostrar
        Nodo temp = top;
        if(temp!=null){
            System.out.println("La pila es: ");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }
        else
            System.out.println("PILA VACÍA.");
    }

    public void Cima(){//Busccar
        if(!vacia())
            System.out.println("Cima; "+top.getValor());
        else
            System.out.println("La pila esta vacía");
    }

    public void Pop(){ //Borrar/Eliminar
        if(!vacia()){
            System.out.println("Data extraido: "+top.getValor());
            top = top.getProx();
        }
        else
            System.out.println("La pila esta vacia");
    }

    public boolean Buscar (){
        Nodo temp = top;
        int  num = temp.getValor();
        boolean encontrado = false;
        while (temp != null && encontrado != true){
            if ( num == temp.getValor()){
                encontrado = true;
            }
            temp = temp.getProx();
        }
        return encontrado;
    }

    public void Minimo() {
        Nodo temp = top;//Crea una copia de la pila por una auxiliar temporal
        int Min = top.getValor();
        if (temp != null) {
            while (temp != null) {
                if (Min >  temp.getValor()) {
                    Min = temp.getValor();
                }
                temp = temp.getProx();//Avanza de posición en la pila
            }
            System.out.println("El valor mínimo es: " + Min);
        } else {
            System.out.println("La pila esta vacía");
        }
    }

<<<<<<< HEAD
    public void Insertar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Ingrese un valor?");
        int dato = sc.nextInt();
        Push(dato);
        
    }

=======
    public void Maxi(){
        Nodo temp = top;
        int max = temp.getValor();
        if (temp != null) {
            while (temp != null) {
                if ( max < temp.getValor()) {
                    max = temp.getValor();
                }
                temp = temp.getProx();
            }
            System.out.println("El valor maximo es: " + max);
        }else{
            System.out.println("Pila esta vacia");
        }
    }
>>>>>>> maxi

}
