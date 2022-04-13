package com.company;

public class Primos {
    // Generar números primos de 1 a max
    static int i;
    static int j;
    // Declaraciones
    static int dim;
    // Tamaño del array
    static boolean[] esPrimo;

    /**
     * Principal metodo que actua para generar un array con los primos existentes hasta el numero que se introduzca
     * @param max Numero maximo para el calculo de numeros primos hasta llegar a ese numero
     * @return Devuelve un array con todos los numeros primos existentes hasta el numero marcado por el parametro de entrada
     */
    public static int[] generarPrimos(int max) {
         dim = max + 1;
        esPrimo = new boolean[dim];
        if (max >= 2) {
            inicializedArray();
            criba();
            return arrayDePrimos();
        } else { // max < 2
            return new int[0];
            // Vector vacío
        }
    }

    /**
     * Metodo el cual rellena el vector principal con numeros primos encontrados
     * @return Devuelve un array con los numeros primos encontrados
     */
    private static int[] arrayDePrimos() {
        int[] primos = new int[numeroDePrimos()];
        for (i = 0, j = 0; i < dim; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }

    /**
     * Metodo que cuenta cuantos numeros primos van ha haber para determinar la longitud del array del vector
     * @return devuelve el numero de longitud que tendra el array del vector el cual se rellenara de numeros primos
     */
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

    /**
     * Metodo que criba para eliminar ciertos numeros los cuales no son primos
     */
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

    /**
     * Metodo que inicializa el array principal de numeros enteros y criba el numero 0 y 1 como no primos
     */
    public static void inicializedArray() {

        for (i = 0; i < dim; i++) {
            esPrimo[i] = true;
        }
        // Eliminar el 0 y el 1, que no son primos
        esPrimo[0] = esPrimo[1] = false;
    }
}