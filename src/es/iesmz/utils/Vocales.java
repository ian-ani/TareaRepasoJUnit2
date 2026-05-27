package es.iesmz.utils;

import java.util.HashSet;
import java.util.Set;

public class Vocales {
    public static int contarVocales(String cadena) {
        int numVocales = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if ("AEIOUaeiou".contains(String.valueOf(cadena.charAt(i)))) numVocales++;
        }

        return numVocales;
    }
}
