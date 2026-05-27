package es.iesmz.utils;

import java.util.HashSet;
import java.util.Set;

public class Vocales {
    private static final Set<Character> kVOCALES = new HashSet<>(Set.of('A', 'E', 'I', 'O', 'U'));

    public static int contarVocales(String cadena) {
        int numVocales = 0;

        for (int i = 0; i < cadena.length(); i++) {
            for (Character vocal: kVOCALES) {
                if (Character.toUpperCase(cadena.charAt(i)) == vocal) {
                    numVocales++;
                }
            }
        }

        return numVocales;
    }
}
