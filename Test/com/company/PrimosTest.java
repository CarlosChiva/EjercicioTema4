package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {
    Primos primos = new Primos();
    int[] vector;

    @BeforeEach
    void setUp() {
        vector=new int[0];
    }

    @Test
    void generarPrimos() {
        int[] numerosPrimoshastaSiete = {2, 3, 5, 7};
        vector = primos.generarPrimos(7);
        assertArrayEquals(vector, numerosPrimoshastaSiete);
    }

    @Test
    void longitud_de_array_1_devuelve_0() {
        int[] numerosPrimoshasta1 = new int[0];
        vector = primos.generarPrimos(1);
        assertEquals(vector.length, numerosPrimoshasta1.length);
    }
    @Test
    void longitud_de_array_devuelve_2() {
        int[] numerosPrimoshasta1 = {2,3};
        vector = primos.generarPrimos(3);
        assertEquals(vector.length, numerosPrimoshasta1.length);
    }


    @Test
    void longitud_de_array() {
        int[] numerosPrimoshastaSiete = {2, 3, 5, 7};
        vector = primos.generarPrimos(7);
        assertEquals(numerosPrimoshastaSiete.length, vector.length);

    }
}