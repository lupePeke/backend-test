package ejercicio.tres;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorPunto {

    public static ArrayList<Punto> leerArchivoPuntos(String nombreArchivo) throws FileNotFoundException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(nombreArchivo)));
        ArrayList<Punto> listaPuntos = new ArrayList<Punto>();
        String contenido = null;

        try {
            while ((contenido = bufferedReader.readLine()) != null) {
                listaPuntos.add(crearPunto(contenido));
            }
        } catch (

        IOException e) {
            e.printStackTrace();
        }

        return listaPuntos;
    }

    private static Punto crearPunto(String contenido) {

        char[] caracteres = contenido.toCharArray();
        String bufferChar = "";

        double x = Double.MAX_VALUE;
        double y = Double.MAX_VALUE;

        if (formatoValido(contenido)) {

            for (int i = 0; i < caracteres.length; i++) {

                if (Character.isDigit(caracteres[i]) || (caracteres[i] == '.') || (caracteres[i] == '-')) {
                    bufferChar = bufferChar + caracteres[i];
                }

                if (caracteres[i] == ',') {
                    x = Double.parseDouble(bufferChar);
                    bufferChar = "";
                }

                if ((caracteres[i] == ')') && (bufferChar.length() > 0)) {
                    y = Double.parseDouble(bufferChar);
                }

            }
        }

        return new Punto(x, y);
    }

    private static boolean formatoValido(String texto) {

        if ((texto.indexOf("Punto") >= 0) && (texto.indexOf("(") >= 0) && (texto.indexOf(")") >= 0)) {
            return true;
        } else {
            return false;
        }
    }

}
