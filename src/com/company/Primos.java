package com.company;

public class Primos {
    // Generar números primos de 1 a max
    static int i;
    static int j;
    // Declaraciones
    static int dim;
    // Tamaño del array
    static boolean[] esPrimo;

    //public boolean eSPrimo(boolean[] booleans){

    //}
    public static int[] generarPrimos(int max) {
         dim = max + 1;
        esPrimo = new boolean[dim];

        if (max >= 2) {
            inicializedArray();
            criba();

            // Rellenar el vector de números primos
            int[] primos = new int[numeroDePrimos()];
            for (i = 0, j = 0; i < dim; i++) {
                if (esPrimo[i]) {
                    primos[j++] = i;
                }
            }
            return primos;
        } else { // max < 2
            return new int[0];
            // Vector vacío
        }
    }

    private static int numeroDePrimos() {
        // ¿Cuántos primos hay?
        int cuenta = 0;
        for (i = 0; i < dim; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }

    private static void criba() {
        // Criba
        for (i = 2; i < Math.sqrt(dim) + 1; i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (j = 2 * i; j < dim; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
    }

    private static void inicializedArray() {
        // Inicializar el array
        for (i = 0; i < dim; i++) {
            esPrimo[i] = true;
        }
        // Eliminar el 0 y el 1, que no son primos
        esPrimo[0] = esPrimo[1] = false;
    }
}