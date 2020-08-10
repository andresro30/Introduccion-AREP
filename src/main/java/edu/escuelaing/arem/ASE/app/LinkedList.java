package edu.escuelaing.arem.ASE.app;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Propiedades de la clase LinkedList
 */
public class LinkedList {
    private Collection<Nodo> datos;
    private Nodo head;
    private Nodo tale;

    public LinkedList(String[] data) {
        datos = new ArrayList<Nodo>();
        head = null;
        tale = null;

        for (String numero : data) {
            datos.add(new Nodo(Integer.parseInt(numero)));
        }
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getTale() {
        return tale;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public void setTale(Nodo tale) {
        this.tale = tale;
    }

    /**
     * @param nodo
     */
    public void add(Nodo nodo) {
        if (datos.isEmpty()) {
            setHead(nodo);
        } else {
            Nodo tale = getTale();
            if (tale != null) {
                tale.setSucesor(nodo);
                nodo.setAnterior(tale);
                setTale(nodo);
            }
        }
        datos.add(nodo);
    }

    /**
     * @param nodo
     */
    public void remove(Nodo nodo) {
        if (datos.contains(nodo)) {
            Nodo ant;
            Nodo sus;

            ant = nodo.getAnterior();
            sus = nodo.getSucesor();
            if (ant != null) {
                ant.setSucesor(sus);
            }
            if (sus != null)
                sus.setAnterior(ant);
            datos.remove(nodo);
        }
    }


    /**
     * @return double
     */
    public double media() {
        double media = 0;

        for (Nodo iterador : datos) {
            media += iterador.getValor();
        }
        media = media / datos.size();
        return media;
    }

    /**
     * @return double
     */
    public double devEstandar() {
        double dev = 0;
        double media = media();

        for (Nodo iterador : datos) {
            dev += Math.pow(iterador.getValor() - media, 2);
        }

        dev = Math.sqrt(dev / (datos.size() - 1));
        return dev;
    }

    /**
     * Imprime los elementos del LinkedList
     */
    public void imprimir() {
        if (!datos.isEmpty()) {
            for (Nodo iterador : datos) {
                System.out.println(iterador.getValor());
            }
        }
    }

}
