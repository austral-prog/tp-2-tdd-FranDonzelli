package com.tp2.password;

import com.tp2.leapyear.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator ejercicio = new PasswordValidator();

    @Test
    void min8ch() {
        assertTrue(ejercicio.min8Ch("abcdefgh"));
        assertFalse(ejercicio.min8Ch("abc"));
    }

    @Test
    void upperLetter() {
        assertTrue(ejercicio.upperLetter("abcdefgH"));
        assertFalse(ejercicio.upperLetter("abcdefgh"));
    }

    @Test
    void lowerLetter() {
        assertTrue(ejercicio.lowerLetter("ABCDEFGh"));
        assertTrue(ejercicio.upperLetter("ABCDEFGH"));
    }

    @Test
    void min1nro() {
        assertTrue(ejercicio.min1nro("Abcdefgh9"));
        assertFalse(ejercicio.min1nro("Abcdefgh"));
    }

    @Test
    void specialChar() {
        assertTrue(ejercicio.specialChar("Abcdefgh!"));
        assertFalse(ejercicio.specialChar("Abcdefgh"));
    }

    @Test
    void isPasswordValid() {
        assertAll(
                () -> assertTrue(ejercicio.min8Ch("Hell0World!")),
                () -> assertTrue(ejercicio.upperLetter("Hell0World!")),
                () -> assertTrue(ejercicio.lowerLetter("Hell0World!")),
                () -> assertTrue(ejercicio.min1nro("Hell0World!")),
                () -> assertTrue(ejercicio.specialChar("Hell0World!"))
        );
        assertAll(
                () -> assertFalse(ejercicio.min8Ch("a")),
                () -> assertFalse(ejercicio.upperLetter("a")),
                () -> assertFalse(ejercicio.lowerLetter("A")),
                () -> assertFalse(ejercicio.min1nro("a")),
                () -> assertFalse(ejercicio.specialChar("a"))
        );
    }
}
