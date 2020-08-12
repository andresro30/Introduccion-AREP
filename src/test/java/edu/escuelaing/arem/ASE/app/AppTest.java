package edu.escuelaing.arem.ASE.app;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void deberiaCalcularDev()
    {
        LinkedList data = new LinkedList(new String[]{"0.4", "0.7", "1.0", "2.1", "2.3", "4.0"});
        LinkedList dataDos  = new LinkedList(new String[]{"186","699","132","272","291","331","199","1890","788","1601"});
        LinkedList dataTres = new LinkedList(new String[]{"100","130","138","155","180","104","110","115"});

        Double valor = data.devEstandar();
        Double valorDos = dataDos.devEstandar();
        Double valorTres = dataTres.devEstandar();

        assertEquals(valor,new Double(1.3397761006974263));
        assertEquals(valorDos,new Double(625.6339806770231));
        assertEquals(valorTres,new Double(27.728273347923107));
    }

    @Test
    public void deberiaCalcularMedia()
    {
        LinkedList data = new LinkedList(new String[]{"0.4", "0.7", "1.0", "2.1", "2.3", "4.0"});
        LinkedList dataDos  = new LinkedList(new String[]{"186","699","132","272","291","331","199","1890","788","1601"});
        LinkedList dataTres = new LinkedList(new String[]{"100","130","138","155","180","104","110","115"});

        Double valor = data.media();
        Double valorDos = dataDos.media();
        Double valorTres = dataTres.media();

        assertEquals(valor,new Double(1.75));
        assertEquals(valorDos,new Double(638.9));
        assertEquals(valorTres,new Double(129.0));
    }
}
