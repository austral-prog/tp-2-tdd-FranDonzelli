package com.tp2.password;

import com.tp2.leapyear.LeapYear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordValidator {

    public boolean min8Ch(String password){
        if (password.length() >= 8){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean upperLetter(String password) {
        String upperPassword = password.toUpperCase();
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == upperPassword.charAt(i)) {
                return true;
            }

        }
        return false;
    }

    public boolean lowerLetter(String password) {
        String lowerPassword = password.toLowerCase();
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == lowerPassword.charAt(i)) {
                return true;
            }

        }
        return false;
    }

    public boolean min1nro(String password) {
        char[] arrayNros = {'0', '1', '2','3','4','5','6','7','8','9'};
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < 10; j++) {               //Otra forma es con Character.isDigit(password.charAt(i)
                if (password.charAt(i) == arrayNros[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean specialChar(String password){
        char[] arrayChars = {'!','@','#','$','%','^','&','*','(',')','_','+','-','=','[',']','{','}','|',';',':',',','.','<','>','?'};
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < arrayChars.length; j++) {
                if (password.charAt(i) == arrayChars[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPasswordValid(String password){
        return (min8Ch(password) && upperLetter(password) && lowerLetter(password) && min1nro(password) && specialChar(password));
    }
}