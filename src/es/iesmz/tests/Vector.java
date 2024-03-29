package es.iesmz.tests;

import java.util.Arrays;

public class Vector {
    public static int[] reverso(int[] v) {
        int[] vInvertido = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            vInvertido[i] = v[v.length - 1 - i];
        }
        return vInvertido;
    }
}
