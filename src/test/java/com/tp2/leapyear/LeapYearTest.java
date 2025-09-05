package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    LeapYear ejercicio = new LeapYear();

    @Test
    void div4() {
        assertTrue(ejercicio.isDiv4(2024));
        assertTrue(ejercicio.isDiv4(2004));
        assertFalse(ejercicio.isDiv4(2003));
        assertFalse(ejercicio.isDiv4(2002));

    }

    @Test
    void div100() {
        assertTrue(ejercicio.isDiv100(1900));
        assertTrue(ejercicio.isDiv100(2100));
        assertFalse(ejercicio.isDiv100(2004));
        assertFalse(ejercicio.isDiv100(2003));
    }

    @Test
    void div400() {
        assertTrue(ejercicio.isDiv400(2000));
        assertTrue(ejercicio.isDiv400(2400));
        assertFalse(ejercicio.isDiv400(1900));
        assertFalse(ejercicio.isDiv400(2100));
    }

    @Test
    void leapYear() {
       // assertTrue(ejercicio.isLeapYear(2020));
        //assertTrue(ejercicio.isLeapYear(2024));
        assertFalse(ejercicio.isLeapYear(2100));
        assertFalse(ejercicio.isLeapYear(1900));
    }
}