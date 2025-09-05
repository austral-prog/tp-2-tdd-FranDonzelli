package com.tp2.leapyear;


public class LeapYear {
    public boolean isDiv4(int year){
        if (year%4 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isDiv100(int year) {
        if (year % 100 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isDiv400(int year){
        if (year % 400 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isLeapYear(int year) {
        if (isDiv100(year) == true){
            if (isDiv400(year) == true) {
                return true;
            }
            else {
                return false;
            }
        }
        if (isDiv4(year) == true) {
            return true;
        }
        return false;
    }
}
