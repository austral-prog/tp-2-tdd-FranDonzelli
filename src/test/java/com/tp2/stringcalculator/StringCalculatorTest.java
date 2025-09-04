package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorTest {

    StringCalculator ejercicio = new StringCalculator();

    @Test
    void emptyString(){
        assertEquals(0, ejercicio.add(""));
        assertNotEquals(0, ejercicio.add("1"));
    }

    @Test
    void singleNumber(){
        assertEquals(1, ejercicio.add("1"));
        assertNotEquals(1, ejercicio.add("2"));
    }

    @Test
    void addComa1(){
        assertEquals(2, ejercicio.add("1,1"));
        assertNotEquals(3, ejercicio.add("3,6"));
    }

    @Test
    void addComa2(){
        assertEquals(3, ejercicio.add("1,1,1"));
        assertNotEquals(4, ejercicio.add("3,6,1"));
    }

    @Test
    void addNewline(){
        assertEquals(3, ejercicio.add("1\n1\n1"));
        assertNotEquals(3, ejercicio.add("2\n2"));
    }

    @Test
    void addNegativos(){
        assertThrows(IllegalArgumentException.class, () -> {
            ejercicio.add("-1");
        });
    }
}



//    Missing tests: .None.
//
//- Empty string should return 0                                   ¡LISTO!
//- Single number should return that number                        ¡LISTO!
//- Two numbers separated by comma should return their sum         ¡LISTO!
//- Multiple numbers separated by comma should return their sum    ¡LISTO!
//- Numbers separated by newline should work as delimiter          ¡LISTO!
//- Negative numbers should throw IllegalArgumentException         ¡LISTO!
