package es.iesmz.tests;

public class Vocales2 {
    public static String sinVocales (String cadena) {
        int totalMayus = 0;
        int totalMinus = 0;
        String cadenaSinVocales = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z') {
                totalMayus++;
            } else {
                totalMinus++;
            }
            String letra  = String.valueOf(cadena.charAt(i));
            if (!(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U"))) {
                cadenaSinVocales += letra; //Con el += se puede concatenar.
            }
        }
        return cadenaSinVocales;
    }
}
