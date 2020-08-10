package edu.escuelaing.arem.ASE.app;


/**
 * Propiedades de la clase Nodo
 */
public class Nodo {

    private int valor;
    private Nodo anterior;
    private Nodo sucesor;


    /**
     * @param valor
     */
    public Nodo(int valor) {
        this.valor = valor;
        anterior = null;
        sucesor = null;
    }


    /**
     * @return
     */
    public Nodo getSucesor() {
        return sucesor;
    }


    /**
     * @param sucesor
     */
    public void setSucesor(Nodo sucesor) {
        this.sucesor = sucesor;
    }


    /**
     * @return
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    /**
     * @return
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
}
