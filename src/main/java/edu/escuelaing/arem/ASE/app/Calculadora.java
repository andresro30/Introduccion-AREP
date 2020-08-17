package edu.escuelaing.arem.ASE.app;

public class Calculadora {

    private LinkedList datos;


    /**
     * Constructor de la clase Calculadora
     *
     * @param info de tipo String[] con la información a operar
     */
    public Calculadora(String[] info) {
        datos = new LinkedList();

        for (String valor : info) {
            datos.add(new Nodo(Double.parseDouble(valor)));
        }
    }

    /**
     * Método encargado de calcular la media de un conjunto de datos
     *
     * @return double
     */
    public double media() throws Exception {
        double media = 0;
        if (datos == null) {
            throw new Exception("Datos incorrectos");
        }
        Nodo nodo = datos.next();
        while (nodo != null) {
            media += nodo.getValor();
            nodo = datos.next();
        }
        media = media / datos.getSize();
        return media;
    }

    /**
     * Método encargado de calcular la desviación estándar de un conjunto de datos
     *
     * @return double
     */
    public double devEstandar() throws Exception {
        double dev = 0;
        double media = media();
        Nodo nodo = datos.next();

        while (nodo != null) {
            dev += Math.pow(nodo.getValor() - media, 2);
            nodo = datos.next();
        }

        dev = Math.sqrt(dev / (datos.getSize() - 1));
        return dev;
    }
}
