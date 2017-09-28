package ejercicio.tres;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class EjercioMain {

    public static void main(String args[]) throws FileNotFoundException {

        ArrayList<Punto> listaPunto = GestorPunto.leerArchivoPuntos("puntos.txt");

        for (int i = 0; i < listaPunto.size(); i++) {
            System.out.println(listaPunto.get(i).getX() + "," + listaPunto.get(i).getY());
        }
    }
}
