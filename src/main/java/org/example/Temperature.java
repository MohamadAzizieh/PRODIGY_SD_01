package org.example;
import java.util.ArrayList;

abstract class Temperature {
    protected double value;
    protected int type; // 1 for Celsius 2 for Fahrenheit 3 for Kelvin

    public ArrayList<Double> getConvertedValues(){ // Method is set to return all the converted values using an ArrayList
        ArrayList<Double> converted = new ArrayList<>();
        if(this.type ==0){
            converted.add(this.value); //to Celsius
            converted.add((this.value * 9/5) + 32); //to Fahrenheit
            converted.add(this.value + 273.15); //to Kelvin
        } else if (this.type ==1) {
            converted.add((this.value - 32) * 5/9); //to Celsius
            converted.add(this.value); //to Fahrenheit
            converted.add((this.value - 32) * 5/9 + 273.15); //to Kelvin
        } else if (this.type ==2) {
            converted.add(this.value - 273.15); //to Celsius
            converted.add((this.value - 273.15) * 9/5 + 32); //to Fahrenheit
            converted.add(this.value); //to Kelvin
        }
        return converted;
    }
}