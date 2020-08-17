package edu.escuelaing.arem.ASE.app;

import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 */
public class App {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("datos"));
            String line = br.readLine();
            while (line != null) {
                operar(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }

    /**
     * Método encargado de llamar a la calculadora
     *
     * @param line de tipo String
     * @throws Exception
     */
    private static void operar(String line) throws Exception {
        String[] data = line.split(",");
        Calculadora calculadora = new Calculadora(data);
        System.out.println("Media: " + calculadora.media() + " Dev: " + calculadora.devEstandar());
    }
}
