package edu.escuelaing.arem.ASE.app;

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
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("datos"));
            String line = br.readLine();
            while(line != null)
            {
                CalcularOperaciones(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }

    public static void CalcularOperaciones(String texto){
        String[] data = texto.split(",");
        LinkedList listaDatos = new LinkedList(data);
        System.out.println("Media: "+listaDatos.media()+" DE: "+listaDatos.devEstandar());
    }
}
