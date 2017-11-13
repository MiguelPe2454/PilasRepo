package sample;

/**
 * Created by lenovo on 08/11/2017.
 */
public class Nodo {
    private int valor; // se guardar el valor
    private Nodo prox; //para enlazar nodos

    public Nodo() { //Constructor que inicializamos el valor de variables
        this.valor = 0;
        this.prox = null;
    }

    public Nodo(int v) {
        this.valor = v;
        this.prox = null;
    }

    public void setValor(int v) {
        valor = v;
    }

    public void setProx(Nodo p) {
        prox = p;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getProx() {
        return prox;
    }


}
