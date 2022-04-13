package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {
Primos primos=new Primos();
int[] vector;
    @Test
    void generarPrimos() {
        int[] numerosPrimoshastaSiete={2,3,5,7};
        vector=primos.generarPrimos(7);
        assertArrayEquals(vector,numerosPrimoshastaSiete);
    }
    @Test
    void generarPrimos_menor_de_dos_devuelve_0() {
        int[] numerosPrimoshasta1=new int[0];
        vector=primos.generarPrimos(1);
        assertArrayEquals(vector,numerosPrimoshasta1);
    }

    @Test
    void inicializedArray_boolean_0_1_returnFalse() {


    }
}