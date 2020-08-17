package edu.escuelaing.arem.ASE.app;


/**
 * Propiedades de la clase LinkedList
 */
public class LinkedList {
    //    private Collection<Nodo> datos;
    private Nodo head;
    private Nodo tale;
    private Nodo now;
    private int size;

    /**
     * Constructor de la clase LinkedList
     */
    public LinkedList() {
        head = null;
        tale = null;
        now = null;
        size = 0;
    }

    /**
     * Método que returna el head
     *
     * @return Nodo
     */
    public Nodo getHead() {
        return head;
    }

    /**
     * Método que returna el tale
     *
     * @return Nodo
     */
    public Nodo getTale() {
        return tale;
    }

    /**
     * Método que modifica el head
     *
     * @param head de tipo Nodo
     */
    public void setHead(Nodo head) {
        this.head = head;
    }

    /**
     * Método que modifica el tale
     *
     * @param tale de tipo Nodo
     */
    public void setTale(Nodo tale) {
        this.tale = tale;
    }


    /**
     * Método que modifica el now
     * @param now de tipo Nodo
     */
    private void setNow(Nodo now) {
        this.now = now;
    }

    public int getSize() {
        return size;
    }

    /**
     * Método encargado de agergar un nuevo nodo
     *
     * @param nodo de tipo Nodo
     */
    public void add(Nodo nodo) {
        if (size == 0) {
            head = nodo;
            tale = nodo;
            now = nodo;
        } else {
            if (tale != null) {
                tale.setSucesor(nodo);
                nodo.setAnterior(tale);
                tale = nodo;
            }
        }
        size++;
    }

    /**
     * Método encargado de eliminar un nodo
     *
     * @param nodo de tpo Nodo
     */
    public void remove(Nodo nodo) {
        if (contains(nodo)) {
            Nodo ant;
            Nodo sus;

            ant = nodo.getAnterior();
            sus = nodo.getSucesor();
            if (ant != null) {
                ant.setSucesor(sus);
            }
            if (sus != null)
                sus.setAnterior(ant);
            size--;
        }
    }

    /**
     * Método encargado de mostrar el elemento actual del LinkedList
     * @return Nodo
     */
    public Nodo next() {
        Nodo actual = null;
        if (now == null) {
            now = head;
        } else {
            actual = now;
            setNow(now.getSucesor());
        }
        return actual;
    }


    /**
     * Método encargado de consultar si un elemento pertenece al LinkedList
     * @param nodo de tipo Nodo
     * @return variable de tipo boolean dependiendo del resultado
     */
    public boolean contains(Nodo nodo) {
        Nodo nodoActual = now;
        while (nodoActual != null) {
            if (nodo.equals(nodo))
                return true;
            nodoActual = nodoActual.getSucesor();
        }
        return false;
    }
}
