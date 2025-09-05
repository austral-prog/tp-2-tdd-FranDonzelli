package com.tp2.stringcalculator;

public class StringCalculator {

    public int add(String numbers) {
        String[] numeros = numbers.split(",|\n");
        if (numbers.contains("-")) {
            throw new IllegalArgumentException("No se pueden negativos");
        }
        else if (numbers.equals("")) {
            return 0;
        }
        else if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else if (numbers.contains(",")| numbers.contains("\n")) {
            int suma = 0;
            for (int i = 0; i < numeros.length; i++) {
                int nro = Integer.parseInt(numeros[i]);
                suma += nro;
            }
            return suma;
        }
        return 0;
    }
}
