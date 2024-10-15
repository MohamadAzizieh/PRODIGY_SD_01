package org.example;

import java.awt.event.KeyEvent;

public class TemperatureFactory{
    public static Temperature createTemperature(int type, double value){
        switch(type){
            case 0: // Celsius
                return new Celsius(value);
            case 1: // Fahrenheit
                return new Fahrenheit(value);
            case 2: // Kelvin
                return new Kelvin(value);
            default:
                throw new RuntimeException();
        }

    }
}