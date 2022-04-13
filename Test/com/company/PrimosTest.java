package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {
Primos primos=new Primos();
int[] vector=primos.generarPrimos(7);
    @Test
    void generarPrimos() {
        int[] numerosPrimoshastaSiete={2,3,5,7};
        assertArrayEquals(vector,numerosPrimoshastaSiete);
    }
}