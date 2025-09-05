package com.tp2.roman;

public class RomanNumerals {

    public String magia(int cantidad, String uno, String cinco, String diez) {
        String numero = "";

        if (cantidad == 4) {
            numero = uno + cinco;
        } else if (cantidad == 9) {
            numero = uno + diez;
        } else {
            if (cantidad >= 5) {
                numero += cinco;
                cantidad -= 5;
            }
            for (int i = 0; i < cantidad; i++) {
                numero += uno;
            }
        }
        return numero;
    }

    public String convert(int number) {
        String nro_romano = "";

        int unidades = number % 10;
        int decenas = (number / 10) % 10;
        int centenas = (number / 100) % 10;
        int millares = (number / 1000) % 10;

        nro_romano += magia(millares, "M", "", "");
        nro_romano += magia(centenas, "C", "D", "M");
        nro_romano += magia(decenas, "X", "L", "C");
        nro_romano += magia(unidades, "I", "V", "X");

        return nro_romano;
    }
}