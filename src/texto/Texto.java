/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ENTRAR
 */
public class Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\ENTRAR\\Desktop\\t.txt")));
            PrintStream escritor = new PrintStream("C:\\Users\\ENTRAR\\Desktop\\t1.txt");
            String data = "";
            ArrayList<String> l = new ArrayList<>();
            String linea = "";
            String[] array;
            while (s.hasNextLine()) {
                array = s.nextLine().split(" ");
                for (int i = 0; i < array.length; i++) {
                    l.add(array[i]);

                }
                Collections.sort(l);
                for (int i = 0; i < l.size(); i++) {
                    escritor.print(l.get(i)+" ");

                }
                    escritor.print("\n");
                l.clear();

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Texto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static public void ordenar(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            String string = arreglo[i];

        }

    }
}
