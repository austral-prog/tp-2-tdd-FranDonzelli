package com.tp2.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RomanNumeralsTest {

    RomanNumerals ejercicio = new RomanNumerals();

    @Test
    void basicos() {
        assertEquals("I", ejercicio.convert(1));
        assertEquals("V", ejercicio.convert(5));
        assertEquals("X", ejercicio.convert(10));
    }

    @Test
    void resta() {
        assertEquals("IV", ejercicio.convert(4));
        assertEquals("IX", ejercicio.convert(9));
    }

    @Test
    void nrosMedianos() {
        assertEquals("XL", ejercicio.convert(40));
        assertEquals("L", ejercicio.convert(50));
        assertEquals("XC", ejercicio.convert(90));
        assertEquals("XCVIII", ejercicio.convert(98));
        assertEquals("C", ejercicio.convert(100));
    }

    @Test
    void nrosGrandes() {
        assertEquals("CD", ejercicio.convert(400));
        assertEquals("D", ejercicio.convert(500));
        assertEquals("CM", ejercicio.convert(900));
        assertEquals("M", ejercicio.convert(1000));
    }

    @Test
    void nroComplejos() {
        assertEquals("MCMXCIV", ejercicio.convert(1994));
        assertEquals("MMDCXCIV", ejercicio.convert(2694));
        assertEquals("MMMCVI", ejercicio.convert(3106));
    }
}
