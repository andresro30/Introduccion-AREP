package edu.escuelaing.arem.ASE.app;


/**
 * Propiedades de la clase Nodo
 */
public class Nodo {

    private double valor;
    private Nodo anterior;
    private Nodo sucesor;


    /**
     * Constructor de la clase Nodo
     * @param valor
     */
    public Nodo(double valor) {
        this.valor = valor;
        anterior = null;
        sucesor = null;
    }


    /**
     * Método que retorna el sucesor
     * @return Nodo
     */
    public Nodo getSucesor() {
        return sucesor;
    }


    /**
     * Método que modifica el sucesor
     * @param sucesor tipo Nodo
     */
    public void setSucesor(Nodo sucesor) {
        this.sucesor = sucesor;
    }


    /**
     * Método que retorna el nodo anterior
     * @return Nodo
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * Método que modifica el nodo anterior
     * @param anterior de tipo Nodo
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    /**
     * Método que retorna el valor del nodo
     * @return double
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método que modifica el valor del nodo
     * @param valor de tipo double
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
